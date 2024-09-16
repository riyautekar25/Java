package Day7;

class Bus implements Runnable {
	int available_seats = 1, passenger;

	Bus(int passenger) {
		this.passenger = passenger;
	}

	public synchronized void run() { // if we did'nt add synchronized keyword then all three passengers will get the same seat which is undesirable
		String name = Thread.currentThread().getName();
		if (available_seats >= passenger) {
			System.out.println(name + " has reserved the seat");
			available_seats = available_seats - passenger;
		} else
			System.out.println("Sorry seats are not available");
	}
}

public class D2_synchronization {

	public static void main(String[] args) {
		Bus b = new Bus(1);
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);

		t1.setName("Siri");
		t2.setName("Riya");
		t3.setName("Jyoti");
		t1.start();
		t2.start();
		t3.start();

	}

}
