package Day6;
class AA extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i=1; i<=3;i++) {
			System.out.println(name);
		}
		}
}

public class D2_jointhread {

	public static void main(String[] args) throws InterruptedException {
		AA t1 = new AA();
		AA t2 = new AA();
		AA t3 = new AA();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t2.start();
		t2.join();
		t1.start();
		t3.start();

	}

}
// Here the thread 2 is completely executed and then only t1 and t3 are executed