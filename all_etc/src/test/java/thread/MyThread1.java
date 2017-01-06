package thread;

public class MyThread1 extends Thread{

	Object lck1=new Object();
	Object lck2=new Object();
	
	public void run(){
		try {
	String name=Thread.currentThread().getName();
		synchronized(lck1){
			System.out.println(name+ " has lock1 ");
		synchronized(lck2){
				System.out.println(name+ " has lock2");
				lck2.wait(1500);
		}}		synchronized(lck1){
					System.out.println(name+ " reenters lock1 ");
					
						lck1.wait(1000);
					}
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	/*MyThread1() throws InterruptedException{
		Thread.sleep(3223);
		run();
	}*/public static void main(String sd[]) throws InterruptedException{
		
		MyThread1 mt1=new MyThread1();
		Thread th1=new Thread(mt1,"target1");
		Thread th2=new Thread(mt1,"target2");
	//	new MyThread1().start();
		th1.start();
		Thread.sleep(200);
		th2.start();
	}
}
