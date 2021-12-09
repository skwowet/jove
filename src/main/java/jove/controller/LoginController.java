package jove.controller;

import jove.repository.ClientRepository;
import jove.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/login")
public class LoginController
{
    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public String findall(Model model)
    {
        model.addAttribute("clients", clientService.getAllClient());
        return "index";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model)
    {
        model.addAttribute("client", clientService.getClientById(Math.toIntExact(id)));
        return "owner";
    }
}

