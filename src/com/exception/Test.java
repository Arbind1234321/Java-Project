package com.exception;

public class Test {
	
	public static void checkAge(int age) throws MyCustomException
	{
		if(age<17)
		{
			throw new MyCustomException("Age is not valid");
		}
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		try {
			checkAge(12);
		} catch (MyCustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
