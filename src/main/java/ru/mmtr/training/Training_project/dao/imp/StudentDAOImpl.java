package ru.mmtr.training.Training_project.dao.imp;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.mmtr.training.Training_project.dao.StudentDAO;
import ru.mmtr.training.Training_project.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Transactional
@Repository
public class StudentDAOImpl implements StudentDAO {
    @PersistenceContext
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getAllStudent() {
        String hql = "SELECT st FROM Student st";
        return (List<Student>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public void addStudent(Student student) {
        entityManager.persist(student);
    }

    @Override
    public boolean studentExists(long studentid) {
        String hql = "SELECT st.studentid FROM Student st WHERE st.studentid = ?1";
        int count = entityManager.createQuery(hql).setParameter(1, studentid).getResultList().size();
        return count > 0 ? true : false;
    }

    @Override
    public Student getStudentById(long studentid) {
        return entityManager.find(Student.class, studentid);
    }


    @Override
    public void updateStudent(Student student) {
        Student std = getStudentById(student.getStudentid());
        std.setSurname(student.getSurname());
        std.setName(student.getName());
        std.setMiddlename(student.getMiddlename());
        entityManager.flush();
    }

    @Override
    public void deleteStudent(long studentid) {
        entityManager.remove(getStudentById(studentid));
    }

}
