package com.springboot.studentdemo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.studentdemo.dao.StudentRespository;
import com.springboot.studentdemo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	private StudentRespository studentRespository;
	
	@Autowired
	public StudentServiceImpl(StudentRespository theStudentRespository) {
		studentRespository= theStudentRespository;
	}
	@Override 
	public List<Student> findAll() {
		return studentRespository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Student findById(int theId) {
		Optional<Student> result=studentRespository.findById(theId);
		Student theStudent=null;
		if (result.isPresent()) {
			theStudent=result.get();
		}else {
			//we did not find the student
			throw new RuntimeException("Did not find Student Id-" +theId);
		}
		return theStudent;
	}

	@Override
	public void save(Student theStudent) {
		studentRespository.save(theStudent);

	}

	@Override
	public void deleteById(int theId) {
		studentRespository.deleteById(theId);

	}

}
