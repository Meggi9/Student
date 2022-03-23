package com.example.application.controller;

import com.example.application.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class studentController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value = "/")
    public String home() {
        return "main_page";
    }

}
