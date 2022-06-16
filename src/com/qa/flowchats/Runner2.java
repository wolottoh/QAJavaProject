package com.qa.flowchats;

public class Runner2 {

	public static void main(String[] args) {

		int A = 8000;

		if (A > 2000) {
			System.out.println("A");

			if (A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");

				if (A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}

		}

	}

}
