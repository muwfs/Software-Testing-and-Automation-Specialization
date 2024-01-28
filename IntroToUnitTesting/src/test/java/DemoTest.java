/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest {
	@Test
	public void test_is_regularTriangle() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void test_is_regularTriangle_2() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}
	
	@Test
	public void test_is_regularTriangle_3() {
		assertTrue(Demo.isTriangle(5, 13, 12));
	}
	
	@Test
	public void test_is_regularTriangle_4() {
		assertTrue(Demo.isTriangle(8, 11, 12));
	}
	@Test
    public void test_is_sumOfTwoSidesIsLessThanThirdSide() {
        assertFalse(Demo.isTriangle(1, 3, 4));
    }
	
	@Test
	public void test_is_NOT_triangle_1() {
		assertFalse(Demo.isTriangle(5, 7, 13));
	}
	
	@Test
	public void test_is_NOT_triangle_aMinusBisC() {
		assertFalse(Demo.isTriangle(5, 1, 4));
	}
	
	@Test
	public void test_is_NOT_triangle_checkOneZero() {
		assertFalse(Demo.isTriangle(2, 0, 4));
	}
	
	@Test
	public void test_is_NOT_triangle_checkTwoZeroes() {
		assertFalse(Demo.isTriangle(0, 0, 4));
	}
	
	
	@Test
	public void test_is_NOT_triangle_checkNegativeNumber() {
		//Just no ...
		assertFalse(Demo.isTriangle(-1, 3, 4));
	}
	
	@Test
	public void test_is_NOT_triangle_checkNegativeNumber2() {
		//Just no ...
		assertFalse(Demo.isTriangle(3, -3, 0));
	}
	
	@Test
	public void test_is_NOT_triangle_checkNegativeNumber3() {
		//Just no ...
		assertFalse(Demo.isTriangle(+3, +3, -6));
	}
	
	@Test
	public void test_is_NOT_triangle_sumEqualsLength() {
		//Just no ...
		assertFalse(Demo.isTriangle(1, 2, 3));
	}
	
	@Test
	public void test_is_NOT_triangle_sumEqualsLength2() {
		//Just no ...
		assertFalse(Demo.isTriangle(1, 1, 2));
	}
	
	@Test
	public void test_is_NOT_triangle_testRightTriangle() {
		//Just no ...
		assertFalse(Demo.isTriangle(3, 3, 3));
	}
	@Test
	public void test_is_NOT_triangle_checkPlus() {
		//Just no ...
		assertFalse(Demo.isTriangle(+5, +4, +3));
	}
	
    @Test
    public void test_is_NOT_triangle_checkEmpty(){
        assertFalse(Demo.isTriangle('\n',3,'!'));
    }
	
    
	@Test
	public void test_main_program_1() {
		String input = "5\n12\n13\n";
		
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: \n";
		consoleOutput += "Enter side 2: \n";
		consoleOutput += "Enter side 3: \n";
		consoleOutput += "This is a triangle.\n";
		
		assertEquals(consoleOutput, out.toString());	
	}
	
	
}
