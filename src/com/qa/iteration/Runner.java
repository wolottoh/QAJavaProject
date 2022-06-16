package com.qa.iteration;

public class Runner {

	public static void main(String[] args) {

		int a = 100;

		while (a < 200) {
			System.out.println("Loop number: " + (a + 1));
			a++;
			if (a > 200) {
				System.out.println("a");
			}

		}

	}

}
