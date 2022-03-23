package com.example.application.controller;

import com.example.application.Enity.Role;
import com.example.application.Enity.Student;
import com.example.application.repository.StudentRepo;
import com.example.application.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

@Controller
public class studentRegistration {

    @Autowired
    private StudentRepo studentRepo;


    @GetMapping("/student-create")
    public String createStudentForm(){

        return "student-create";
    }

    @PostMapping("/student-create")
    public String createStudent(Student student, Map<String, Object> model)throws IOException {
        Student userFromDb = studentRepo.findByUsername(student.getUsername());

        if (userFromDb != null) {
            model.put("message", "Пользователь с таким логином уже зарегистрирован!");
            return "student-create";
        }

        student.setRoles(Collections.singleton(Role.Student));
        studentRepo.save(student);
        return "redirect:/login";
    }
}
