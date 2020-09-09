package com.gmu.students;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="student")
public class Student {
	
	private String firstName;
	
	
	private String lastName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String gNum;
	
	private String visitingPurpose;
	
	
	public Student() {
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getgNum() {
		return gNum;
	}

	public void setgNum(String gNum) {
		this.gNum = gNum;
	}

	public String getVisitingPurpose() {
		return visitingPurpose;
	}

	public void setVisitingPurpose(String visitingPurpose) {
		this.visitingPurpose = visitingPurpose;
	}
	
	
}
