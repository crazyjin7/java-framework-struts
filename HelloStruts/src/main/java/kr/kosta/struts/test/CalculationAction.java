package kr.kosta.struts.test;

import com.opensymphony.xwork2.Action;

public class CalculationAction {
	private int value1 = 0;
	private int value2 = 0;
	private int resultValue = 0;
	private String calculator = "";

	public String addition() {
		System.out.println("[addition]");
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);

		calculator = "+";
		resultValue = value1 + value2;

		return Action.SUCCESS;
	}

	public String subtraction() {
		System.out.println("[subtraction]");
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);

		calculator = "-";
		resultValue = value1 - value2;

		return Action.SUCCESS;
	}

	public String multiplication() {
		System.out.println("[multiplication]");
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);

		calculator = "*";
		resultValue = value1 * value2;

		return Action.SUCCESS;
	}

	public String division() {
		System.out.println("[division]");
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);

		calculator = "/";
		resultValue = value1 / value2;

		return Action.SUCCESS;
	}


	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public int getResultValue() {
		return resultValue;
	}

	public void setResultValue(int resultValue) {
		this.resultValue = resultValue;
	}

	public String getCalculator() {
		return calculator;
	}

	public void setCalculator(String calculator) {
		this.calculator = calculator;
	}








}
