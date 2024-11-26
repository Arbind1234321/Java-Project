package Multithreading;

public class B {

	public synchronized void d2(A a) {
		System.out.println("Thread 2 started d2() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread 2 trying to call A last method");
		a.last();
	}

	public synchronized  void last() {
		System.out.println("Inside B last method");
	}
}
