package com.example.application.repository;

import com.example.application.Enity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {

    Student findByUsername(String username);
    Optional<Student> findById(Long record_number);

}
