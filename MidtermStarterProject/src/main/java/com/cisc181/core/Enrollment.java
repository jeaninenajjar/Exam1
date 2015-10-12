package com.cisc181.core;

import java.util.UUID;


public class Enrollment extends Section{

	
	
	private UUID StudentID;
	private UUID EnrollmentID;
	private Double Grade;
	
	
	private Enrollment() {

	}


	public Enrollment(UUID StudentID, UUID SectionID) {
		super();
		
		this.StudentID = StudentID;
		setEnrollmentID(EnrollmentID);
		
	}


	private void setEnrollmentID(UUID enrollmentID2) {
		this.EnrollmentID = EnrollmentID;
		
	}


	public void setGrade(Double grade) {
		this.Grade = grade;
	}}

