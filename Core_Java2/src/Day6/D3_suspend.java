package Day6;

class PP extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}
	}
}

public class D3_suspend {

	public static void main(String[] args) {
		PP t1 = new PP();
		PP t2 = new PP();
		PP t3 = new PP();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.start();
		t2.start();
		t2.suspend();
		t3.start();
		t2.resume();
	}

}
