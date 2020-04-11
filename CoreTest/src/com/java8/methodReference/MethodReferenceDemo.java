package com.java8.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		MethodReferenceDemo tester = new MethodReferenceDemo();

		List names = new ArrayList();
		names.add("Nikhil");
		names.add("Komal");
		names.add("Ramesh");
		names.add("Popat");
		
		//Method Reference Example
		names.forEach(System.out::println);
	}

}
