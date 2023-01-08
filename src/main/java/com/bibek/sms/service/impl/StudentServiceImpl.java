package com.bibek.sms.service.impl;

import com.bibek.sms.entity.Student;
import org.springframework.stereotype.Service;
import com.bibek.sms.repository.StudentRepository;
import com.bibek.sms.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

//    @Override
//    public Student saveStudent(Student student) {
//        return studentRepository.save(student);
//    }
//
//    @Override
//    public Student getStudentById(Long id) {
//        return studentRepository.findById(id).get();
//    }
//
//    @Override
//    public Student updateStudent(Student student) {
//        return studentRepository.save(student);
//    }
//
//    @Override
//    public void deleteStudentById(Long id) {
//        studentRepository.deleteById(id);
//    }

}

