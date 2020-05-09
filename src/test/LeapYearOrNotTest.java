/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import main.LeapYearOrNot;
/**
 * @author Raj
 *
 */
public class LeapYearOrNotTest {

	LeapYearOrNot obj=new LeapYearOrNot();
	
	/**
	 * Test method for {@link main.LeapYearOrNot#checkLeapYearOrNot()}.
	 */
	@Test
	public void checkYear1992LeapOrNot() {
		ByteArrayInputStream in = new ByteArrayInputStream("1992".getBytes());
	    System.setIn(in);
	    assertEquals("Year 1992 is a Leap Year",obj.checkLeapYearOrNot());
	    }

	@Test
	public void checkYear2000LeapOrNot() {
		ByteArrayInputStream in = new ByteArrayInputStream("2000".getBytes());
	    System.setIn(in);
	    assertEquals("Year 2000 is a Leap Year",obj.checkLeapYearOrNot());
	    }
	
	@Test
	public void checkYear1900LeapOrNot() {
		ByteArrayInputStream in = new ByteArrayInputStream("1900".getBytes());
	    System.setIn(in);
	    assertEquals("Year 1900 is not a Leap Year",obj.checkLeapYearOrNot());
	    }
}
