package com.cts.MultiThreading_MultiTasking;

public class Multithreading implements Runnable{	// extends Thread
	
	public void run(){
		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 0; i < 3; i++)
			System.out.println(i + "thread");
		
		System.out.println("end");
	}

	public static void main(String[] args) throws InterruptedException {
		Multithreading mul = new Multithreading();
	/*	mul.start();	// multithreading
		mul.run();		// not the multithreading
	 */		
		Thread t = new Thread(mul);
		
		t.start();
		t.setName("thread1");
		
		t.join();
		
		Thread t1 = new Thread(mul);
		t1.setName("thread2");
		t1.start();
	}

}

