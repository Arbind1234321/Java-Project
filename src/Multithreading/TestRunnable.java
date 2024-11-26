package Multithreading;

public class TestRunnable {

	public static void main(String[] args) 
	{
		MyThread mt=new MyThread();
		//Thread t=new Thread();
		
	    //mt.start();
		for(int i=0;i<1;i++)
		{
			System.out.println("main thread");
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(mt.getName());

	}

}
