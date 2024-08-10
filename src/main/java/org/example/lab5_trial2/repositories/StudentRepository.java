package org.example.lab5_trial2.repositories;

import org.example.lab5_trial2.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findStudentByName (String name);
}
