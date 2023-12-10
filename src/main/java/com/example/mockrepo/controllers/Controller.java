package com.example.mockrepo.controllers;

import com.example.mockrepo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/admin")
    public String admin() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String user() {
        return service.returnHello();
    }

    @GetMapping("/all")
    public String all() {
        return "you should log in, NOW!";
    }
}
