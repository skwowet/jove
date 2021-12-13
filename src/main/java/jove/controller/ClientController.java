package jove.controller;

import jove.entity.*;
import jove.service.ClientService;
import jove.service.ProjectOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ProjectOrderService projectOrderService;

//    @GetMapping("")
//    public String list(Model model){
//        List<ProjectOrder> projectOrders = projectOrderService.getAllProjectOrder();
//        model.addAttribute("projectOrders", projectOrders);
//        return "index";
//    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        Client theClient = clientService.getClientById(id);
        model.addAttribute("theClient", theClient);
        model.addAttribute("id", id);

        ProjectOrder theProjectOrder = new ProjectOrder();
        model.addAttribute("theProjectOrder", theProjectOrder);

        if (theClient != null) {
            List<ProjectOrder> clientListProjects = theClient.getListProjects();
            model.addAttribute("clientListProjects", clientListProjects);
        }

        return "client";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("theProjectOrder") ProjectOrder theProjectOrder, @RequestParam("id") int id) {
        Client client = clientService.getClientById(id);
        theProjectOrder.setClient(client);
        projectOrderService.addProjectOrder(theProjectOrder);
        clientService.updateClient(client);
        return "redirect:/client/" + id;
    }

//    @PostMapping("/update")
//    public String update(@ModelAttribute("theClient") Client theClient) {
//        clientService.updateClient(theClient);
//        return "redirect:/client/" + theClient.getClient_id();
//    }

    @PostMapping("/update")
    public String update(@ModelAttribute("theClient") Client theClient, @RequestParam("id") int id) {
        Client update = clientService.getClientById(id);
        if (update != null) {
            update.setClient_name(theClient.getClient_name());
            update.setUsername(theClient.getUsername());
            update.setAddress(theClient.getAddress());
            update.setPhone_number(theClient.getPhone_number());
            clientService.updateClient(update);
        }
        return "redirect:/client/" +id;
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("id") int id, @RequestParam("cid") int cid)
    {
        Client client = clientService.getClientById(cid);
        ProjectOrder projectOrder = projectOrderService.getProjectOrderById(id);
        client.removeProjectOrder(projectOrder);
        clientService.updateClient(client);
        projectOrderService.deleteProjectOrder(projectOrder);
        return "redirect:/client/"+cid;
    }
}
