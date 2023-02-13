package ru.mmtr.training.Training_project.dao;


import ru.mmtr.training.Training_project.entity.University;

import java.sql.SQLException;
import java.util.List;

public interface UniversityDAO {
    //create
    void add(University university) throws SQLException;

    //read
    List<University> getall() throws SQLException;

    //update
    void update(University university) throws SQLException;

    //delete
    void remove(University university) throws SQLException;
}
