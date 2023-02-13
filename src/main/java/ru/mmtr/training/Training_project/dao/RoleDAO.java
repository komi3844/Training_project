package ru.mmtr.training.Training_project.dao;


import ru.mmtr.training.Training_project.entity.Role;

import java.sql.SQLException;
import java.util.List;

public interface RoleDAO {
    //create
    void add(Role role) throws SQLException;

    //read
    List<Role> getall() throws SQLException;

    //update
    void update(Role role) throws SQLException;

    //delete
    void remove(Role role) throws SQLException;
}
