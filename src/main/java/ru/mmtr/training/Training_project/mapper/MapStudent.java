package ru.mmtr.training.Training_project.mapper;

import org.springframework.stereotype.Component;
import ru.mmtr.training.Training_project.dao.StudentDAO;
import ru.mmtr.training.Training_project.dao.imp.StudentDAOImpl;
import ru.mmtr.training.Training_project.dto.StudentDTO;
import ru.mmtr.training.Training_project.entity.Student;
import ru.mmtr.training.Training_project.model.StudentModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapStudent {
    public StudentDTO map(Student model){
        StudentDTO studentDto = new StudentDTO();
        studentDto.setSurname(model.getSurname());
        studentDto.setName(model.getName());
        return studentDto;
    }

    public List<StudentDTO> mapToStudentModelList(List<Student> studentList){
        List<StudentDTO> studentDTOList = new ArrayList<>();
        for(Student student: studentList) {
            StudentDTO studentDto = new StudentDTO();
            studentDto.setSurname(student.getSurname());
            studentDto.setName(student.getName());
            studentDto.setMiddlename(student.getMiddlename());
            studentDto.setBirthday(student.getBirthday());
            studentDto.setGender(student.getGender());
            studentDto.setBirthday(student.getBirthday());
            studentDto.setStatus(student.getStatus());
            studentDTOList.add(studentDto);
        }
        return studentDTOList;
    }

    public List<StudentDTO> mapToStudentModelById(StudentDTO studentId){
        List<StudentDTO> studentDTOList = new ArrayList<>();
        Student student = new Student();
        StudentDTO studentDto = new StudentDTO();
        if(student.getStudentid() == studentDto.getStudentid()) {
            studentDto.setSurname(student.getSurname());
            studentDto.setName(student.getName());
            studentDto.setMiddlename(student.getMiddlename());
            studentDto.setBirthday(student.getBirthday());
            studentDto.setGender(student.getGender());
            studentDto.setBirthday(student.getBirthday());
            studentDto.setStatus(student.getStatus());
            studentDTOList.add(studentDto);
        }
        return studentDTOList;
    }
}
