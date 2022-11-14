package com.edu;
class Myclass1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class multithreat{
	public static void main(String[] args) throws InterruptedException {
		Myclass1 ob=new Myclass1();
	     Thread tob=new Thread(ob);
	     tob.setName("first");
	       tob.start();
	       tob.join();
	       Myclass1 ob1=new Myclass1();
	       Thread tob1=new Thread(ob1);
	       tob1.setName("second");
	       tob1.start();
	}
     
}
