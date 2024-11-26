package Multithreading;

public class A {
	public synchronized void d1(B b) {
		System.out.println("Thread 1 start d1() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 1 trying to call A last method");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside A last() method");
	}
}
