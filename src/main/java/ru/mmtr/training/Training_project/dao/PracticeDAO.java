package ru.mmtr.training.Training_project.dao;


import ru.mmtr.training.Training_project.entity.Practice;

import java.sql.SQLException;
import java.util.List;

public interface PracticeDAO {
    //create
    void add(Practice practice) throws SQLException;

    //read
    List<Practice> getall() throws SQLException;

    //update
    void update(Practice practice) throws SQLException;

    //delete
    void remove(Practice practice) throws SQLException;
}
