package com.saswat.springboot.springrestapimvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saswat.springboot.springrestapimvc.model.Student;
import com.saswat.springboot.springrestapimvc.repo.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository repository;

	public Student readProduct(Integer id) {
		return repository.findById(id).get();
	}
	
	public Student createProduct(Student product) {
		return repository.save(product);
	}
	
	public List<Student> readProducts(){
		return repository.findAll();
	}
	
	public Student updateProduct(Student product) {
		return repository.save(product);
	}
	
	public void deleteProduct(Integer id) {
		repository.deleteById(id);
	}
	
	
}
