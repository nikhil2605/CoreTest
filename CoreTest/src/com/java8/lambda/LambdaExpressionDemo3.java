package com.java8.lambda;

public class LambdaExpressionDemo3 {
	
	public static void main(String[] args) {
		
		LambdaExpressionDemo3 tester = new LambdaExpressionDemo3();
		
		GreetMessage greetMsg = massage ->
		System.out.println(massage);
		greetMsg.welcomeMsg("Nikhil");
	}

}

interface GreetMessage{
	void welcomeMsg(String msg);
}
