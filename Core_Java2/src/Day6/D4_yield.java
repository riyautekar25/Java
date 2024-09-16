package Day6;

class BB extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
			Thread.yield();
		}
	}
}

class QQ extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}
	}
}

public class D4_yield {

	public static void main(String[] args) {
		BB t1 = new BB();
		QQ t2 = new QQ();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();

	}

}
