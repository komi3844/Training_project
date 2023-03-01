package ru.mmtr.training.Training_project.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcity;

    @OneToOne
    private Request request;

    private String name_city;
}
