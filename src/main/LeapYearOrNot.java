package main;

/**
 * @author Raj
 *
 */
public class LeapYearOrNot {

	public boolean checkLeapYearOrNot(int year) {
		Boolean flag = null;
		int length=String.valueOf(year).length();
		if((length<=4) && (length>=1)) {
			if((year%400==0) || (year%4==0) && (year%100!=0) ) {
				flag=true;
			}
			else {
				flag=false;
			}
		}	
		else {return false;}
			
		if(Boolean.TRUE.equals(flag)) {
			System.out.println("Year "+year+" is a Leap Year");
			return true;
		}
		else {
			System.out.println("Year "+year+" is not a Leap Year");
			return false;
			}
	}
	
}
