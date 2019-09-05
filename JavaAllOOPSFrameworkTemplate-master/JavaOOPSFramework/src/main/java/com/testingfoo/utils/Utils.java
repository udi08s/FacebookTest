package com.testingfoo.utils;

import java.util.Random;

public class Utils {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final String[] firstName= {"Kevin","Steve","Mark","Adam","Eva","Sachin","Peter","Bruce","William","Charlie"};
	private static final String[] lastName=  {"Smith","Johnson","Brown","King","Miller","Thomas","Sydney","White","Singh","Bell"};

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
	public static String randomFirstName() {
		
		Random r = new Random();

        return firstName[r.nextInt(firstName.length)];
		
	}
	
	public static String randomLastName() {
		
		Random r = new Random();

        return lastName[r.nextInt(lastName.length)];
		
	}
	

}
