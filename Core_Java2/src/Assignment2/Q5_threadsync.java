package Assignment2;

class Increment implements Runnable {
	int count;
	int var_loop;

	Increment(int var_loop) {
		this.var_loop = var_loop;
	}

	public synchronized void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= var_loop; i++) {
			count++;
		}
		System.out.println(name + " increemented the counter by " + var_loop);
		System.out.println("Counter value is "+count);
	}

}

public class Q5_threadsync {

	public static void main(String[] args) {
		Increment i1 = new Increment(5);
		//Increment i2 = new Increment(5);
		Thread t1 = new Thread(i1);
		Thread t2 = new Thread(i1);

		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();

		System.out.println("Final counter value: " );

	}

}
