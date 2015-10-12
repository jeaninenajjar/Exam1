package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static int setUpBeforeClass() throws Exception {
	
	  @SuppressWarnings("deprecation") 
	  Date bdate = new Date(1950, Calendar.JANUARY, 01);
	Date hire = new Date(1980, Calendar.JUNE, 01);
	 ArrayList<Staff> listOfStaffClass = new ArrayList<Staff>(); 
	
     Staff Jones = new Staff("Rebecca","Susan", "Jones", bdate, " 1 Happy Street", "(555)-123-1234", "hi@yahoo.com", "Monday", 1, 100000, hire, eTitle.DR) ;

     Staff Mary = new Staff("Mary","Susan", "Jones", bdate, " 1 Happy Street", "(555)-123-1234", "hi@yahoo.com", "Monday", 1, 150000, hire, eTitle.DR) ;

     Staff George = new Staff("George","Susan", "Jones", bdate, " 1 Happy Street", "(555)-123-1234", "hi@yahoo.com", "Monday", 1, 80000, hire, eTitle.DR) ;

     Staff Tom = new Staff("Tom","Susan", "Jones", bdate, " 1 Happy Street", "(555)-123-1234", "hi@yahoo.com", "Monday", 1, 60000, hire, eTitle.DR) ;

     Staff Carl = new Staff("Carl","Susan", "Jones", bdate, " 1 Happy Street", "(555)-123-1234", "hi@yahoo.com", "Monday", 1, 50000, hire, eTitle.DR) ;
	
       listOfStaffClass.add(Jones);
       listOfStaffClass.add(Mary);
       listOfStaffClass.add(Tom);
       listOfStaffClass.add(Carl);
       listOfStaffClass.add(George);
      
	
       public int calculateAverage(listOfStaffClass) { 
    	      int sum = 0;
    	      for (int i=0; i< listOfStaffClass.size(); i++) {
    	            sum += 1;
    	      }
    	      return (int) ((double)sum / listOfStaffClass.size());
    	  }
       
       
       @Test
   	public void test1() {
       
       assertTrue("Assertion ",calculateAverage(listOfStaffClass)==88000);
}
}
}
