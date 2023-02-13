package ru.mmtr.training.Training_project.dao;


import ru.mmtr.training.Training_project.entity.Request;

import java.sql.SQLException;
import java.util.List;

public interface RequestDAO {
    //create
    void add(Request request) throws SQLException;

    //read
    List<Request> getall() throws SQLException;

    //update
    void update(Request request) throws SQLException;

    //delete
    void remove(Request request) throws SQLException;
}
