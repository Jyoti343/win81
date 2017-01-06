package thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.junit.Test;



public class ProducerConsumerSolution1 {

	@Test
	public void produce_consume(){
		BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
		Producer p=new Producer(bq);
		Consumer c=new Consumer(bq);
		
		p.start();
		
		c.start();
	}
	
}
class Producer extends Thread{
	
	BlockingQueue<Integer> sharedQueue;
	
	public Producer(BlockingQueue<Integer> sharedQueue){
	   super("PRODUCER");
		this.sharedQueue=sharedQueue;
	}
	public void run(){
	
		for (int i=0;i<10;i++){
			try {
		    System.out.println(getName()+" produced "+i);
				sharedQueue.put(i);
				Thread.sleep(200);
			}
		catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
class Consumer extends Thread{
	
	BlockingQueue<Integer> sharedQueue;
	Consumer(BlockingQueue<Integer> sharedQueue){
		super("CONSUMER");
		this.sharedQueue=sharedQueue;
	}
	public void run(){		
		try{
			while(true){
				Integer item=sharedQueue.take();
				System.out.println(getName()+" consumed "+item);
			}
		}catch(InterruptedException sd){
			sd.printStackTrace();
		}
		
	}
}


