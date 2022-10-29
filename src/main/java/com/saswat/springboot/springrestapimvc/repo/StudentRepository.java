package com.saswat.springboot.springrestapimvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saswat.springboot.springrestapimvc.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
