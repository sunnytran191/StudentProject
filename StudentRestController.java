package com.springboot.studentdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.studentdemo.entity.Student;
import com.springboot.studentdemo.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentRestController {
	
	
	//quick inject student service
	private StudentService studentService;
	
	@Autowired
	public StudentRestController(StudentService theStudentService) {
		studentService= theStudentService;
	}
	//add mapping for "/list"
	@GetMapping("/list")
	public String listStudents(Model theModel) {
		//get student from db
		List<Student> theStudent=studentService.findAll();
	
		//add to the spring model
		theModel.addAttribute("students", theStudent);
	
		return "students/list-students";
	}
	
	@GetMapping("students/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		//create the model attribute to bind form data
		Student theStudent= new Student();
		theModel.addAttribute("students", theStudent);
		return "students/student-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId")int theId, Model theModel) {
		//get the student from the service
		Student theStudent= studentService.findById(theId);
		
		//set the student as a model attribute to pre-populate the form
		theModel.addAttribute("students",theStudent);
		//send over to our form
		return "students/student-form";
	}
	
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {
		//save the student
		studentService.save(theStudent);
		
		//use a redirect to prevent duplicate
		return "redirect:/students/list";
	}
	
	@GetMapping("/delete")
	public String delete (@RequestParam("studentId") int theId) {
		//delete the student 
		studentService.deleteById(theId);
		
		//redirect to main page
		return "redirect:/students/list";
		
	}
	
}