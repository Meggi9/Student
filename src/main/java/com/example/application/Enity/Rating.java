package com.example.application.Enity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

//@Data
//@Entity
//@Table(name="tablerat")
public class Rating {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

//    @Column(name="namedisc")
    private String NameDisciplane;

//    @Column(name="formcontr")
    private String FormContr;

//    @Column(name="ratings")
    private String Ratings;

//    @Column(name="teacher")
    private String Teacher;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="student_id")
//    private Student student;

    public Rating(){

    }

    public Rating(String nameDisciplane, String formContr, String ratings, String teacher) {
//        this.id = id;
        NameDisciplane = nameDisciplane;
        FormContr = formContr;
        Ratings = ratings;
        Teacher = teacher;
//        this.student = student;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getNameDisciplane() {
        return NameDisciplane;
    }

    public void setNameDisciplane(String nameDisciplane) {
        NameDisciplane = nameDisciplane;
    }

    public String getFormContr() {
        return FormContr;
    }

    public void setFormContr(String formContr) {
        FormContr = formContr;
    }

    public String getRatings() {
        return Ratings;
    }

    public void setRatings(String ratings) {
        Ratings = ratings;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }

//    public List<Rating> tolist(){
//
//    }
}
