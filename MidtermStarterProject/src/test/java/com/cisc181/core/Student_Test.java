package com.cisc181.core;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import org.junit.BeforeClass;
import com.cisc181.eNums.eMajor;


public class Student_Test {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	
	UUID id1 = UUID.randomUUID();
	UUID id2 = UUID.randomUUID();
	UUID id3 = UUID.randomUUID();
	UUID id4 = UUID.randomUUID();
	UUID id5 = UUID.randomUUID();
	UUID id6 = UUID.randomUUID();
	
	 ArrayList<Course> listOfCourse = new ArrayList<Course>(); 
		
     Course Math = new Course(id1, "Math", 4 , eMajor.PHYSICS) ;
     Course Health = new Course(id1, "Health", 4 , eMajor.NURSING) ;
     Course Micro = new Course(id1, "Micro", 4 , eMajor.BUSINESS) ;

    
       
       listOfCourse.add(Math);
       listOfCourse.add(Health);
       listOfCourse.add(Micro);
       
       
        Date start = new Date(2015, Calendar.FEBRUARY, 01);
    	Date end = new Date(2015, Calendar.JUNE, 01);
    	  Date start2 = new Date(2015, Calendar.AUGUST, 01);
     	 Date end2 = new Date(2015, Calendar.DECEMBER, 01);
	
       ArrayList<Semester> listOfSemester = new ArrayList<Semester>(); 
       Semester Spring = new Semester(id1, start, end  ) ;
       Semester Fall = new Semester(id1, start2, end2  ) ;
		listOfSemester.add(Spring);
		listOfSemester.add(Fall);
		
       ArrayList<Section> listOfSection = new ArrayList<Section>(); 
       
	
      Section springhealth = new Section (id1, id2, id3, 602);
      Section fallhealth = new Section (id2, id4, id3, 302);
      Section springmath = new Section (id3, id4, id5, 201);
      Section fallmath = new Section (id1, id6, id4, 012);
      Section springmicro = new Section (id5, id1, id6, 02);
      Section fallmicro = new Section (id6, id5, id3, 101);
	
	listOfSection.add(springhealth);
	listOfSection.add(fallhealth);
	listOfSection.add(springmath);
	listOfSection.add(fallmath);
	listOfSection.add(springmicro);
	listOfSection.add(fallmicro);
	
	
	 ArrayList<Student> listOfStudent = new ArrayList<Student>(); 
	 Date bdate = new Date(1990, Calendar.JANUARY, 01);
		Date hire = new Date(1980, Calendar.JUNE, 01);
	 

	
	Student Carlos = new Student ("Carlos" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Kim = new Student ("Kim" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Alice = new Student ("Alice" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Mike = new Student ("Mike" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Nick = new Student ("Nick" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Jess = new Student ("Jess" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Sam = new Student ("Sam" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Cindy = new Student ("Cindy" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Kevin = new Student ("Kevin" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Danielle = new Student ("Danielle" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	Student Steve = new Student ("Steve" ,"Reid" ,"Smith" ,bdate, eMajor.BUSINESS, "1 Lane", "(555)-123-1234", "hi@udel.edu");
	
	listOfStudent.add(Carlos);
	listOfStudent.add(Kim);
	listOfStudent.add(Alice);
	listOfStudent.add(Mike);
	listOfStudent.add(Nick);
	listOfStudent.add(Jess);
	listOfStudent.add(Sam);
	listOfStudent.add(Cindy);
	listOfStudent.add(Kevin);
	listOfStudent.add(Danielle);
	listOfStudent.add(Steve);
	
	
	
	
	}
	

}
