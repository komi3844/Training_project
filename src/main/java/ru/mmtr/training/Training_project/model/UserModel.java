package ru.mmtr.training.Training_project.model;

import io.swagger.annotations.ApiModelProperty;

public class UserModel {
    int id;
    String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
