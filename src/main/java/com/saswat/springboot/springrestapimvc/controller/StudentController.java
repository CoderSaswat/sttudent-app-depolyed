package com.saswat.springboot.springrestapimvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saswat.springboot.springrestapimvc.model.Student;
import com.saswat.springboot.springrestapimvc.service.ProductService;

@RestController
public class StudentController {
	@Autowired
	ProductService service;

	@GetMapping("/")
	public String test() {
		return "Hi, Saswat your crud app has been successfully deployed to azure";
	}

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to deployement";
	}

	@PostMapping("/createStudent")
	public Student createProduct(@RequestBody Student product) {
		return service.createProduct(product);
	}

	@GetMapping("/readStudent/{id}")
	public Student readProduct(@PathVariable("id") Integer id) {
		return service.readProduct(id);
	}

	@PutMapping("/updateStudent")
	public Student updateProduct(@RequestBody Student product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/deleteStudent/{id}")
	public void deleteProduct(@PathVariable("id") Integer id) {
		service.deleteProduct(id);
	}

	@GetMapping("/readStudents")
	public List<Student> readProducts() {
		return service.readProducts();
	}

}
