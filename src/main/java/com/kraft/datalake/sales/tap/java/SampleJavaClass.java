package com.kraft.datalake.sales.tap.java;

import org.joda.time.LocalTime;

public class SampleJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world I am in main java class");
		LocalTime localTime = new LocalTime();
		System.out.println("Current time is" + localTime);
		localTime.plusHours(3);
		System.out.println("Current time is plus 3 hours is" + localTime.plusHours(3));
	}

}
