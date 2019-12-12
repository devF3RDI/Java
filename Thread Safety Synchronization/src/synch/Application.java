package synch;

public class Application {

	public static void main(String[] args) {
		
		Sequence seq = new Sequence();
		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(seq.getNext());
		
		Worker worker1 = new Worker(seq);
		Worker worker2 = new Worker(seq);
		worker1.start();
		worker2.start();
		
		
			
		}
	//This current code will cause duplicate numbers because the processor can only hand over control to 1 processor at a time.
	//So this can cause the thread to be half way through a code block or method and then the processor gives the control to the other thread. 
	//We use the Synchronized block to denote all or nothing, so it either totally completes the synch block or doesnt start it. 
}




class Worker extends Thread {
	
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() { 			//Any thread must overide the run() method. 
		
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " got value : " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
	}
	
}
}
