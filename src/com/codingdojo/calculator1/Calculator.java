package com.codingdojo.calculator1;

public class Calculator {
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double operandThree = 0.0;
	private String operations = "";
	private Double getResults = 0.0;

	

	public Calculator() {
	}	
	public Calculator(Double operandOne, Double operandTwo, Double operandThree, String Operations, Double getResults) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operandThree = operandThree;
		this.operations = Operations;
	}
	
	
	
	
	public Double getOperandOne() {
		return operandOne;
	}
	
	public Double getOperandTwo() {
		return operandTwo;
	}
	
	public Double getOperandThree() {
		return operandThree;
	}
	
	public String getOperations() {
		return operations;
	}
	
	public Double getGetresults() {
		return getResults;
	}
	
	
	
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void setOperandThree(Double operandThree) {
		this.operandThree = operandThree;
	}
	
	public void setOperations(String operations) {
		this.operations = operations;
	}
	
	public void setGetResults(Double getResults) {
		this.getResults = getResults;
	}
	

	
	
	public void performOperation() {
		if(getOperations().equals("+")) {
			Double total = getOperandOne() + getOperandTwo();
			getResults = total;
		}
		if(getOperations().equals("-")) {
			Double total = getOperandOne() - getOperandTwo();
			getResults = total;
		}
		if(getOperations().equals("*")) {
			Double total = getOperandOne() * getOperandThree();
			getResults = total;
		}
	}
	
	public void getResults() {
		System.out.println(getGetresults());
	}
}


