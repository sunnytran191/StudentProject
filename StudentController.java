package com.gmu.students;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	//add an initbinder .. to convert input strings
	//remove leading and trailing white space
	//resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		 
		//add student object to the model
		theModel.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute ("student") Student theStudent, BindingResult theBindingResult) {
		
		System.out.println("G number: |"+theStudent.getgNum()+"|");
		
		System.out.println("Binding result: "+ theBindingResult);
		
		System.out.println("/n/n/n/n");
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}else {
			//log the input data
			System.out.println("theStudent: "+ theStudent.getFirstName()+" "+ theStudent.getLastName());
			return "student-confirmation";
		}
	}
	
	
}
