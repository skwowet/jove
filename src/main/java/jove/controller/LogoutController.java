package jove.controller;

import jove.entity.Client;
import jove.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/logout")
public class LogoutController {

    @GetMapping("")
    public String logout()
    {
        return "logout";
    }
}
