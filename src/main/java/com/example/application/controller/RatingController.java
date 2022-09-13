package com.example.application.controller;

import com.example.application.Enity.Student;
import com.example.application.dao.RatingDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tablerat")
public class RatingController {
    private RatingDAO ratingDAO;

    @Autowired
    public RatingController(RatingDAO ratingDAO){
        this.ratingDAO = ratingDAO;
    }

    @GetMapping
    public String RecordBook(@AuthenticationPrincipal Student student,
                              Model model){
//        Optional<Student> FullnameStud = studentService.findById(student_id);
        model.addAttribute("student", student);
        model.addAttribute("tablerat", ratingDAO.RecordBook(student));
        return "RecordBook";
    }
}
