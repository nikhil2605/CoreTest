package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionDemo1 {

	public static void main(String[] args) {

		List<String> names1 = new ArrayList<String>();
		names1.add("Nikhil");
		names1.add("Ajay");
		names1.add("Ajit");
		names1.add("Komal");

		List<String> names2 = new ArrayList<String>();
		names2.add("Nikhil");
		names2.add("Ajay");
		names2.add("Ajit");
		names2.add("Komal");

		LambdaExpressionDemo1 tester = new LambdaExpressionDemo1();

		System.out.println("\nCompare using java7:\n");
		tester.sortUsingJava7(names1);
		System.out.println(names1);

		System.out.println("\nCompare using java8:\n");
		tester.sortUsingJava7(names2);
		System.out.println(names2);
	}

	public void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}

	public void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

}
