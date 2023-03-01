package ru.mmtr.training.Training_project.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpractice;

    @ManyToMany
    private List<Users> users = new ArrayList<Users>();

    @OneToOne
    @JoinColumn(name = "idgrade")
    private Grade grade;

    @OneToOne
    @JoinColumn(name = "idrequest")
    private Request request;

    @OneToOne
    private Student studentid;
    private String direction_practice;
    private int course;
    private Date date_start;
    private Date date_finish;
}
