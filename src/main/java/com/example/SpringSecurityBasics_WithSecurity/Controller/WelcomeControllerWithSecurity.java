package com.example.SpringSecurityBasics_WithSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControllerWithSecurity {

    @GetMapping("/welcome-with-security")
    public String saywelcomeWithSecurity(){
        return "welcome to spring application with security";
    }
}
