package ru.mmtr.training.Training_project.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mmtr.training.Training_project.dao.StudentDAO;
import ru.mmtr.training.Training_project.dto.StudentDTO;
import ru.mmtr.training.Training_project.entity.Student;
import ru.mmtr.training.Training_project.mapper.MapStudent;
import ru.mmtr.training.Training_project.repository.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StudentService implements IStudentService {

    private final StudentDAO studentDAO;
    private final MapStudent mapStudent;
    private final StudentRepository studentRepository;


    @Override
    public List<StudentDTO> getAllStudent() {
        return studentDAO.getAllStudent().stream().map(mapStudent::map).collect(Collectors.toList()); //mapStudent.mapToStudentModelList(studentDAO.getAllStudent());
    }

    @Override
    public boolean addStudent(Student student) {
        if (studentDAO.studentExists(student.getStudentid())) {
            return false;
        } else {
            studentDAO.addStudent(student);
            return true;
        }
    }

    @Override
    public StudentDTO getStudentById(StudentDTO studentId) {
        return null;//mapStudent.mapToStudentModelById(studentId);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(long studentid) {
        studentDAO.deleteStudent(studentid);
    }
}


