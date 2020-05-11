/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.LeapYearOrNot;
/**
 * @author Raj
 *
 */
public class LeapYearOrNotTest {

	LeapYearOrNot leapYearOrNot=new LeapYearOrNot();
	
	/**
	 * Test method to check years divisible by 400 are leap year
	 */
	@Test
	public void checkYear2000LeapOrNot() {
	    assertEquals(true,leapYearOrNot.checkLeapYearOrNot(2000));
	    }
	
	/**
	 * Test method to check years divisible by 100 but not by 400 are not leap year
	 */
	
	@Test
	public void checkYear1900LeapOrNot() {
	    assertEquals(false,leapYearOrNot.checkLeapYearOrNot(1900));
	    }
	@Test
	public void checkYear2100LeapOrNot() {
	    assertEquals(false,leapYearOrNot.checkLeapYearOrNot(2100));
	    }
	
	
	/**
	 * Test method to check years divisible by 4 but not by 100 are leap year
	 */
	@Test
	public void checkYear2008LeapOrNot() {
	    assertEquals(true,leapYearOrNot.checkLeapYearOrNot(2008));
	    }

	/**
	 * Test method to check years not divisible by 4 are not leap year
	 */
	@Test
	public void checkYear2019LeapOrNot() {
	    assertEquals(false,leapYearOrNot.checkLeapYearOrNot(2019));
	    }
	
	/**
	 * Length Validation
	 */
	@Test
	public void checkYear4LeapOrNot() {
	    assertEquals(true,leapYearOrNot.checkLeapYearOrNot(4));
	    }
	
	@Test
	public void checkYear50LeapOrNot() {
	    assertEquals(false,leapYearOrNot.checkLeapYearOrNot(50));
	    }
	
	@Test
	public void checkYear400LeapOrNot() {
	    assertEquals(true,leapYearOrNot.checkLeapYearOrNot(400));
	    }
	
	@Test
	public void checkYear50000LeapOrNot() {
	    assertEquals(false,leapYearOrNot.checkLeapYearOrNot(50000));
	    }
}
