package jove.controller;

import jove.entity.*;
import jove.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private SoftwareService softwareService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private ProjectLeadService projectLeadService;

    @Autowired
    private ProgrammerService programmerService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        Owner theOwner = ownerService.getOwnerById(id);
        model.addAttribute("theOwner", theOwner);
        model.addAttribute("id", id);

        List<Client> clients = clientService.getAllClient();
        model.addAttribute("clients", clients);

        List<Software> softwares = softwareService.getAllSoftware();
        model.addAttribute("softwares", softwares);

        List<ProjectLead> projectLeads = projectLeadService.getAllProjectLead();
        model.addAttribute("projectLeads", projectLeads);

        List<Programmer> programmers = programmerService.getAllProgrammer();
        model.addAttribute("programmers", programmers);

        return "owner";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("theOwner") Owner theOwner, @RequestParam("id") int id) {
        Owner update = ownerService.getOwnerById(id);
        if (update != null) {
            update.setOwner_name(theOwner.getOwner_name());
            update.setUsername(theOwner.getUsername());
            ownerService.updateOwner(update);
        }
        return "redirect:/owner/" + id;
    }
}
