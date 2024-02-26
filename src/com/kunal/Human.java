package com.kunal;

public class Human {
	int age;
    String name;
    int salary;
    boolean marrried;
    static long population;
    
	public Human(int age, String name, int salary, boolean marrried) {
		
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.marrried = marrried;
		 
		this.population +=1;
	}

    
	
}
