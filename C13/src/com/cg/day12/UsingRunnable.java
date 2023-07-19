package com.cg.day12;

public class UsingRunnable implements Runnable{
	//if run() method is not declared then UsingRunnable will show an error
	Thread t;
	int h,l;
	String msg;

	
	public UsingRunnable(int h, int l, String msg) {
		super();
		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		for(int i=h;i<l;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(msg + i);
		}
	}
}
