package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
