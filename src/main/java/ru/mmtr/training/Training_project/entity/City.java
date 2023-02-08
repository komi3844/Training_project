package ru.mmtr.training.Training_project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class City{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcity;

    private String name_city;
}
