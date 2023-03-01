package ru.mmtr.training.Training_project.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usersid;

    @ManyToMany
    private List<Practice> practices = new ArrayList<Practice>();

    @OneToOne
    @JoinColumn(name = "idrole")
    private Role role;

    private String name;
    private String surname;
    private String middlename;
    private String job_title;
}
