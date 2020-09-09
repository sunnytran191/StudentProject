package com.springboot.studentdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.studentdemo.entity.Student;

public interface StudentRespository extends JpaRepository<Student, Integer> {
	//add a method to sort by last name
	public List<Student> findAllByOrderByLastNameAsc();
	
}
