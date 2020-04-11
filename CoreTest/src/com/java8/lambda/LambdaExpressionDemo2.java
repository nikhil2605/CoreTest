package com.java8.lambda;

public class LambdaExpressionDemo2 {

	public static void main(String[] args) {

		LambdaExpressionDemo2 tester = new LambdaExpressionDemo2();

		MathOperation addition = (a, b) -> a + b;
		MathOperation substraction = (a, b) -> a - b;
		MathOperation multiplication = (a, b) -> a * b;
		MathOperation division = (a, b) -> a / b;

		System.out.println(tester.result(10, 15, addition));
		System.out.println(tester.result(10, 15, substraction));
		System.out.println(tester.result(10, 15, multiplication));
		System.out.println(tester.result(10, 15, division));

	}

	private int result(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

}

interface MathOperation {
	int operation(int x, int y);
}
