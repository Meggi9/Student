package com.example.application.service;

import com.example.application.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.application.Enity.Student;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements UserDetailsService {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return studentRepo.findByUsername(username);
    }

    public Optional<Student> findById(Long id)
    {
        return studentRepo.findById(id);
    }

}


