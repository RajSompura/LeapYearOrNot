package main;

import java.io.Console;
import java.util.Scanner;

/**
 * @author Raj
 *
 */
public class LeapYearOrNot {

	public static void main(String[] args) {
		LeapYearOrNot leapYearOrNot=new LeapYearOrNot();
		leapYearOrNot.checkLeapYearOrNot();
	}

	public String checkLeapYearOrNot() {
		Boolean flag = null;
		System.out.println("Check wheter year is Leap Year or Not");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year : ");
		int year=sc.nextInt();
		sc.close();
		try {
			if(year%400==0) {
				flag=true;
			}
			else if(year%100==0) {
				flag=false;
			}
			else if(year%4==0) {
				flag=true;
			}
			else {
				flag=false;
			}
		} catch (Exception e) {}
		
		if(Boolean.TRUE.equals(flag)) {
			System.out.println("Year "+year+" is a Leap Year");
			return "Year "+year+" is a Leap Year";
		}
		else {
			System.out.println("Year "+year+" is not a Leap Year");
			return "Year "+year+" is not a Leap Year";}
	}
	
}
