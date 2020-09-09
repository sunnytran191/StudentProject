package com.springboot.studentdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.studentdemo.entity.Student;


public interface StudentService {

	List<Student> findAll();

	Student findById(int theId);

	void save(Student theStudent);

	void deleteById(int theId);

}
