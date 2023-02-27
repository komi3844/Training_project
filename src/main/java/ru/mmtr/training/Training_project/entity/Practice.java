package ru.mmtr.training.Training_project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Practice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpractice;

    private long userid;
    private long idgrade;
    private long idrequest;
    private long studentid;
    private String direction_practice;
    private int course;
    private Date date_start;
    private Date date_finish;
}
