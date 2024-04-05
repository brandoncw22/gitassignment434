import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class groupTest {
	group obj = new group();
	@Before
	public void startUp() {
	obj = new group();
	}
	
	@Test
	public void testMultiply() {
		
		assertEquals(6,obj.multiply(3,2), 1);
	}

	@Test(expected = AssertionError.class)
	public void testPower0() {
		
		assertEquals(0,obj.power(1, 0));
		
	}
	
	@Test
	public void testPower1() {
		
		assertEquals(9,obj.power(3, 2));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivision0() {
		
		assertEquals(0,obj.division(5, 0), 1);
	}
	@Test
	public void testDivision1() {
		
		assertEquals(3,obj.division(3, 1), 1);
	}

}
