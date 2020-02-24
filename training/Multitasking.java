package com.cts.training;
class Music extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){e.printStackTrace();}
		
		for(int i = 0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + "  " + i + "thread");
		
		System.out.println("end");
	}
}
class Games extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){e.printStackTrace();}
		
		for(int i = 0; i < 3; i++)
			System.out.println(Thread.currentThread().getName() + "  " + i + "thread");
		
		System.out.println("end");
	}
}
public class Multitasking {

	public static void main(String[] args) throws InterruptedException {
		Music m = new Music();
		m.start();
		m.setName("Musiclibrary");
		
		Music m1 = new Music();
		m1.start();
		m1.setName("Musiclibrary 1");
		
		Music m2 = new Music();
		m2.start();
		m2.setName("Musiclibrary 2");
		
		Games g = new Games();
		g.start();
		g.setName("Game 1");
		
		Games g1 = new Games();
		g1.start();
		g1.setName("Game 2");
	}

}
