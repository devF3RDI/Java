package synch;

public class Sequence {

	private int value = 0;
								//You can also add synchronized to the method signature and then the method will be synchronized. eg on next line
	public int getNext() {		// public synchronized int getNext();
								// ......your normal code goes here with not need for a synchronized block.
		
		synchronized (this) {	//This is also known as a lock, as the thread is locked until all the code is completed.
			
		value++;				//To make this all or notthing we use the synchronized key word and enter our code into the synch block
		return value;			//We also need to put the object that is being synchronized which in this case is .this so its the instance of this.
		}
		
	}
}
