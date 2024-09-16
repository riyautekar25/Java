package Day7;
class P extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class D1_Priority {

	public static void main(String[] args) {
		P t1 = new P();
		P t2 = new P();
		P t3 = new P();
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t1.setPriority(2);
		t2.setPriority(6);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();

	}

}





//Thread priority
//In java it is possible to assign the priority of thread 
//to set these priority java thread class has provided two predefined methods.
//1. setPrioirty() 
//2. getPriority()
//The thread class has also provided 3 predefined final static variable its value lies between 1 to 10
//1. Thread.MIN_PRIORITY---->1
//2. Thread.NORM_PRIORITY---->5
//3. Thread.MAX_PRIORITY---->10

// Synchronization
// It is a technique through which we can control multiple threads or among the number threads only one thread will enter inside the synchronized area
// The main purpose of this is to overcome the problem of multi-threading when multiple threads are trying to access same resource at the same time on that situation it may provide some wrong output 

// Types of Synchronization - two types
// 1. Method level synchronization
//    - Here, the entire method get synchronized so that only one thread will enter inside the synchronized area and remaining all the threads will wait at the method level
// 2. Block level synchronization
//    - Here, the entire method is not get synchronized, only the part of the method get synchronized, we have to enclosed those few lines of the code inside the synchronized block

