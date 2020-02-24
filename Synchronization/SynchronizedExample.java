package com.cts.Synchronization;

class Transcation{
	int amount ,flag = 0;
	
	public synchronized int withdraw(int amount) {
		
		System.out.println("withdraw method");
		if(flag == 0 || this.amount < amount){
			
			try {
				System.out.println("wait for withdraw");
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		if(flag == 1 && this.amount < amount || this.amount == 0){
			try {
				throw new Exception("insufficient funds");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			this.amount -= amount;
			System.out.println(amount + " amount is withdraw");
		}
		
		return this.amount;
	}
	
	public synchronized void deposit(int amount){
		System.out.println("deposit method");
		this.amount += amount;
		System.out.println(amount + "  is deposited.");
		notifyAll();
		flag = 1;
	}
}

public class SynchronizedExample {

	public static void main(String[] args) {
		
		Transcation trans = new Transcation();
		
		Thread with = new Thread(){
			public void run(){
				int remaining = trans.withdraw(400);
				System.out.println("remaining amount is " + trans.amount);
			}
		};
		
		with.setName("Dharun");
		with.start();
		
		Thread deposited = new Thread(){
		public void run(){
				trans.deposit(2000);
				trans.deposit(20000);
				System.out.println("remaining amount is " + trans.amount);
			}
		};
		
		deposited.setName("Dharun deposit");
		deposited.start();
		
	}

}

