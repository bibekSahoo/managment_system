package com.bibek.sms.repository;

import com.bibek.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    @Override
    List<Student> findAll();
}
