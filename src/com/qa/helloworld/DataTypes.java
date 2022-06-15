package com.qa.helloworld;

public class DataTypes {

	public static void main(String[] args) {
		int result = myNum();
		System.out.println(result);
		System.out.println(myBool());
		System.out.println(myLetter());
		System.out.println(myLongNum());
		System.out.println(myFloatNum());
		System.out.println(myText());
		methodSeven();
	}

	public static int myNum() {
		return 0;
	}

	public static boolean myBool() {
		return true;
	}

	public static char myLetter() {
		return 'P';
	}

	public static long myLongNum() {
		return 52L;
	}

	public static float myFloatNum() {
		return 0.6f;
	}

	public static String myText() {
		return "Hi there";
	}

	public static  void methodSeven() {
		// no return
	}

}


