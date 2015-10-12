package com.cisc181.core;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonException extends Exception{

	

/**
	 * 
	 */
	private static final long serialVersionUID = 6852515986892204769L;

public static void main(String[] args) {
		
	

	}



    static Calendar today = Calendar.getInstance();
    static Calendar bdate = new GregorianCalendar(1950, Calendar.JANUARY, 1);
    public static int age = today.get(Calendar.YEAR) - ((Calendar) bdate).get(Calendar.YEAR); {
    	 
        
    
    String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
    Pattern pattern = Pattern.compile(regex);
    
   	
    	
    if(age > 100) {
        throw new IllegalArgumentException("Can't be older than 100");
    }
	
    }}

