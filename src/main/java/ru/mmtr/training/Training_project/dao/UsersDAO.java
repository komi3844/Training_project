package ru.mmtr.training.Training_project.dao;


import ru.mmtr.training.Training_project.entity.Users;

import java.sql.SQLException;
import java.util.List;

public interface UsersDAO {
    //create
    void add(Users users) throws SQLException;

    //read
    List<Users> getall() throws SQLException;

    //update
    void update(Users users) throws SQLException;

    //delete
    void remove(Users users) throws SQLException;
}
