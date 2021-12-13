package jove.controller;

import jove.entity.Client;
import jove.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public String showLogin(Model model)
    {
        List<Client> clients = clientService.getAllClient();
        model.addAttribute("clients", clients);
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model)
    {
        Client theClient = new Client();
        model.addAttribute("theClient", theClient);
        return "client-signup";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("theClient") Client theClient)
    {
        clientService.addClient(theClient);
        return "redirect:/login";
    }
}

