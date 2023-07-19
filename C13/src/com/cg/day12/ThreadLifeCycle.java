package com.cg.day12;

public class ThreadLifeCycle extends Thread{
	@Override
	public void run() {
		System.out.println("Is Thread is alive: "+this.isAlive());
		int num = 0;
		while(num<7) {
			num++;
			System.out.println("Number: "+num);
		}
		try {
			Thread.sleep(1000);
			System.out.println("Is Thread is alive in runnable: "+this.isAlive());
		}
		
		catch(InterruptedException e) {
			System.err.println("Exception occurred");
		}
	}
	public static void main(String[] args) {
		Thread a = new ThreadLifeCycle();
		System.out.println("Is Thread alive before Runnable: "+a.isAlive());
		a.start();
		try {
			a.sleep(1000);
		}
		catch (InterruptedException e) {
			System.out.println("Exception Occurred");
			}
		System.out.println("Is Thread alive exception: "+a.isAlive());	
	}

}
