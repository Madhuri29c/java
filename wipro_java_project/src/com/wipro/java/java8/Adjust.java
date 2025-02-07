package com.wipro.java.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class Adjust {
	//Function to check date and time
	//according to our requirement
	public static void checkingAdjusters() {
		
		//to get the current date
		LocalDate date = LocalDate.now();
		System.out.println("The current date is"+date);
		
		//to get the first day of next month
		LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayOfNextMonth:"+dayOfNextMonth);
		
		//get the next Saturday
		LocalDate nextSaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("next saturday from now is"+nextSaturday);
		
		//to get the first day of this month
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("firstDayOfMonth:"+firstDay);
		
		//to get the last of the current month
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("lastDayOfMonth:"+lastDay);
	}
	//Driver code
	public static void main(String[] args) {
		checkingAdjusters();

	}

}
