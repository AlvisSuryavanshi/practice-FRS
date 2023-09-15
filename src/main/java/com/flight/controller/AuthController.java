package com.flight.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @RequestMapping("/signup")
    public String signup(){
        return "Signup page.";
    }
    @RequestMapping("/logout")
    public String logout() {
        return "logout Page";
    }
   
}
