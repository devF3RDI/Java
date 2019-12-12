
public class Application {
	
	public static void main(String [] args) {
	/*
	 * There are two ways to start threads, whats shown below by extending the Thread Class and Overriding the run() method, then instantiating
	 * a new object of the class the extends thread and then calling .start() on the object. 
	 * 
	 * The second way is by implementing the Runnable interface, when doing it this way its done the same but you would need to create a 
	 * object of type Thread and pass it the taskRunner as a argument. Then on the Thread object call .start()
	 * It looks like this ---
	 * 
	 * Task taskRunner1 = new Task("A");
	 * Thread t1 = new Thread(taskRunner1);
	 * t1.start();
	 * 
	 * and your Task implements Runnable{
	 * 
	 * To make this even smaller rather than creating a taskRunner1 object and then passing it to the Thread object, you can pass the new Task 
	 * to the Thread, like this --
	 * 
	 * Thread t1 = new Thread(new Task("A"));
	 * t1.start() 
	 * 
	 * There is also using annonymous classes or objects as it doesnt need a name its basically just being passed to the thread object.
	 * This is done like this ---
	 * 
	 * Thread t1 = new Thread(new Runnable(){
	 * 		public run()                              you would then put the run() method written below into the annonymous class 
	 *      		
		for(int i =0; i<1000; i++) {
			System.out.println("Number :" + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
				 
	 * });
	 * t1.start()  //These lines above can do all the same as the code below in a much more compact space.
	 * 
	 * Because its a annoymous class there is no contructor (Default is used) so there cant be a setName method in the constructor.
	 * 
	 * IN ALL 3 WAYS OF CREATING AND STARTING THREADS THERE IS 2 COMMON PROPERTIES 
	 * 	1. A THREAD IS INSTANTIATED
	 *  2. THE START() METHOD IS CALLED ON IT.
	 */
		
		System.out.println("Starting TaskRunner 1");
		Task taskRunner1 = new Task("A");
		taskRunner1.start();
		
		System.out.println("Starting TaskRunner 2");
		Task taskRunner2 = new Task("B");
		taskRunner2.start();
		
	// .start initialises the thread, it can be confusing with most people thinking to call the run() method but this is not the case..	
		
	}
}

class Task extends Thread {
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(name);
		
		for(int i =0; i<1000; i++) {
			System.out.println("Number :" + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
// The threads are running concurrently which can be shown in the console with each number printing twice, once for each thread. 
// If this was ran without multi threading it would print out numbers 1-1000 on  thread 0 and then the same for thread 1. 
// Threads are ran simultaneously, like applications on your pc. 
// A daemon thread is ran in the background without needing interaction from the user. 