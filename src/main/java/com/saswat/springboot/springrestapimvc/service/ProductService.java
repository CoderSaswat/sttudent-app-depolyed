package com.saswat.springboot.springrestapimvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saswat.springboot.springrestapimvc.dao.StudentDao;
import com.saswat.springboot.springrestapimvc.model.Student;

@Service
public class ProductService {
	@Autowired
	StudentDao dao;

	public Student readProduct(Integer id) {
		return dao.readProduct(id);
	}

	public Student createProduct(Student product) {
		return dao.createProduct(product);
	}

	public List<Student> readProducts() {
		return dao.readProducts();
	}

	public Student updateProduct(Student product) {
		return dao.updateProduct(product);
	}
	
	public void deleteProduct(Integer id) {
		dao.deleteProduct(id);
	}
}
