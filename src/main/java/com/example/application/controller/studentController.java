package com.example.application.controller;

import com.example.application.Enity.Student;
import com.example.application.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class studentController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value = "/")
    public String home() {

        return "main_page";
    }

    @GetMapping(value = "/student")
    public String pageStudent(@AuthenticationPrincipal Student student, Model model){
        model.addAttribute("student", student);

        return "personalpage";
    }

}
