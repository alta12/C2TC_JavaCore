package com.cg.day12;

public class ChildThreadDemo {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread(3,"First");
		ChildThread t2 = new ChildThread(5,"Second");
		t1.start();
		t2.start();
	}

}
