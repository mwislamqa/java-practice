package ThreadDemo;
//create thread two type 1.exteds thread 2.implement runable interface
// thread is lightwait sub process.
// we can crate multiplae thread but all should be invike from main thread.
public class MyThread extends Thread {
	//overriden method from thread
	public void run() {
		System.out.println("default thread method");
		
		run(10);//nested method .multi task in single thread.
	}
	
	public void run(int a) {
		System.out.println("default thread method--a");
	}
	
	public static void main(String[] args) {
		
		MyThread mt= new MyThread();
		mt.start();
	
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread"+i);
		}
	}

}

