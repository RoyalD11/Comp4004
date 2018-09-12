package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {
	
	public void testAdd() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		//The first number after the bracket is what you expect to get from the
			//Operation solver.METHOD()
		assertEquals(4, solver.add(2, 2));
	}
	
	public void testSubtract() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(4, solver.subtract(6, 2));
	}
	
	public void testMultiply() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(16, solver.multiply(4, 4));
	}
	
	public void testDivide() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(3, solver.divide(9, 3));
	}
	
	public void testModulus() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(1, solver.modulus(5, 2));
	}
}
