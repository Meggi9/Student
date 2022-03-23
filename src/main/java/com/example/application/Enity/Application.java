package com.example.application.Enity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "way_to_get")
    private String way_to_get;

    @Column(name = "document_type")
    private String document_type;

    @JoinColumn (name="student_id")
    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    private Student student;

   /** @JoinColumn (name="data_id")
    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    private Data data;*/

    public Application() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWay_to_get() {
        return way_to_get;
    }

    public void setWay_to_get(String way_to_get) {
        this.way_to_get = way_to_get;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

   /** public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }*/
}
