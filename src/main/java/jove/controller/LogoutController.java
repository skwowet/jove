package jove.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/logout")
public class LogoutController {

    @GetMapping("")
    public String logout()
    {
        return "logout";
    }
}
