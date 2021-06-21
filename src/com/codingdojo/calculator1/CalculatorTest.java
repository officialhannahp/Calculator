package com.codingdojo.calculator1;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		c.setOperandOne(10.5);

		c.setOperations("+");

		c.setOperandTwo(5.2);
		
		c.setOperations("*");
		
		c.setOperandThree(7.2);

		c.performOperation();

		c.getResults();

	}

}
