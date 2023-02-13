package ru.mmtr.training.Training_project.dao;

import ru.mmtr.training.Training_project.entity.City;

import java.sql.SQLException;
import java.util.List;

public interface CityDAO{
    //create
    void add(City city) throws SQLException;

    //read
    List<City> getall() throws SQLException;

    //update
    void update(City city) throws SQLException;

    //delete
    void remove(City city) throws SQLException;
}
