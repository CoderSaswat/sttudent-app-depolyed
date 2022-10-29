package com.saswat.springboot.springrestapimvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer id;
	private String name;

	private Integer mark;





	public void setId(Integer id) {
		this.id = id;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getMark() {
		return mark;
	}

	public Integer getId() {
		return id;
	}



}
