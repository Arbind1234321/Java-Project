package com.demo;

class A {
	void Add() {
		System.out.println("I am parent");
	}
}

public class Demo extends A {

	void Add() {
		System.out.println("hello i am child");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.Add();

	}

}
