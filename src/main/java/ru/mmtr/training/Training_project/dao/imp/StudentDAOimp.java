package ru.mmtr.training.Training_project.dao.imp;

import ru.mmtr.training.Training_project.config.HibernateUtil;
import ru.mmtr.training.Training_project.dao.StudentDAO;
import ru.mmtr.training.Training_project.entity.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentDAOimp implements StudentDAO {

    @Override
    public void add(Student student) throws SQLException {

    }

    @Override
    public List<Student> getall() throws SQLException {
        List<Student> students = (List<Student>) HibernateUtil.getSessionFactory().openSession().createQuery("From Student").list();
        return students;
    }

    @Override
    public void update(Student student) throws SQLException {

    }

    @Override
    public void remove(Student student) throws SQLException {

    }
}
