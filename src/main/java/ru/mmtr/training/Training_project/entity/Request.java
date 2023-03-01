package ru.mmtr.training.Training_project.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idrequest;

    @OneToOne
    @JoinColumn(name = "idcity")
    private City city;

    @OneToOne
    @JoinColumn(name = "studentid")
    private Student studentid;

    private String status;
    private Date date_application;
}
