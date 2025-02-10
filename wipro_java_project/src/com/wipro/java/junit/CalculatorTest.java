package com.wipro.java.junit;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

		private final Calculator calculator = new Calculator();
		@Test
		public void testAdd() {
			int result = calculator.add(3, 5);
			assertEquals(8, result);
		}
		@Test
		public void testSubstract() {
			int result = calculator.substract(10, 5);
			assertEquals(5, result);
		}
		@Test
		public void testAddWithNegativeNumbers() {
			int result = calculator.add(-10, 5);
			assertEquals(-5, result);
		}
		
		@Test
		public void testSubstractWithNEgativeNumbers() {
			int result = calculator.substract(22, -11);
			assertEquals(33, result);
		}
		

		

}
