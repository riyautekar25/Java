package Day6;

class B extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}
	}
}

public class D1_scheduler {

	public static void main(String[] args) {
		B t1 = new B();
		B t2 = new B();
		B t3 = new B();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.start();
		t2.start();
		t3.start();

	}

}

// Thread Scheduler
// it is part of JVM which executes multiple threads on a single processor randomly

// Thread life cycle
// As we know a thread is well known for independent execution
// During the life cycle a thread can move from different states
// 1. new state (born)
// 2. Runnable state (Ready)
// 3. Running state (execution)
// 4. Waiting state (Blocked)
// 5. Dead state (exit)

// sleep() and join() method
// - sleep(): It is used to put thread into temporary waiting state. (for delay) Thread.sleep();
// - join(): The main purpose of the join method is to put the thread into temporary waiting state so that it executes completely any particular thread among all the threads available in the thread pool 
//           join() also throw the exception: InterruptedException

// suspend() and resume()
// - suspend(): It is mainly used for putting the thread from running state to waiting state.
// - resume(): Used to resume a suspended thread from waiting state to running state.
// Note: not supported by 1.4 java onwards

// yield()
// - yield(): it is a method of thread class that allows us to run another thread which has same priority by pause its current thread.

// stop(): It is a method of Thread class which is used to terminate a thread permanently 
// 		   Not supported by 1.4 java onwards

// isAlive(): it is a predefined method of Thread class through which we can verify whether a thread is alive or not. It returns boolean output. If you use isAlive method before the start method then it will return false.


