package ru.mmtr.training.Training_project.entity;

import javax.persistence.*;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iduniversity;

    @ManyToOne
    @JoinColumn(name = "idfaculty")
    private Faculty faculty;

    @ManyToOne
    @JoinColumn(name = "idcity")
    private City city;

    private String name_university;
}
