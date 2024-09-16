package Day6;
class P1 extends Thread {
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			System.out.println(name);
		}
	}
}
public class D5_stopmethod {

	public static void main(String[] args) {
		P1 t1 = new P1();
		P1 t2 = new P1();
		P1 t3 = new P1();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t1.start();
		t2.start();
		t2.stop();
		t3.start();

	}

}
