package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester extends Course {

	
	//Semester has the following attributes: SemesterID (UUID), StartDate (date), EndDate (date).  5 points.
	

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	public Semester () {}
	
	public Semester( UUID SemesterID, Date StartDate, Date EndDate) {
		super();
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}


	public UUID getSemesterID() {
		return SemesterID;
	}


	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}


	public Date getStartDate() {
		return StartDate;
	}


	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}


	public Date getEndDate() {
		return EndDate;
	}


	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	
	
}

