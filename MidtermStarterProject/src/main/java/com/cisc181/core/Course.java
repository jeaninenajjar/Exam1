package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course extends Student{

	
	
	//Course has the following attributes: CourseID (UUID), CourseName (String).  GradePoints(int
	
		private UUID CourseID;
		private String CourseName;
		private int GradePoints;
		
		
		public UUID getCourseID() {
			return CourseID;
		}


		public void setCourseID(UUID courseID) {
			CourseID = courseID;
		}


		public String getCourseName() {
			return CourseName;
		}


		public void setCourseName(String courseName) {
			CourseName = courseName;
		}


		public int getGradePoints() {
			return GradePoints;
		}


		public void setGradePoints(int gradePoints) {
			GradePoints = gradePoints;
		}


		public Course () {}
		public Course(UUID courseID, String courseName, int gradePoints, eMajor Major) {
			super();
			CourseID = courseID;
			CourseName = courseName;
			GradePoints = gradePoints;
		}
		
		
		
			
	
}
