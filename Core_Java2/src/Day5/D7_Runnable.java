package Day5;
class B implements Runnable{
	public void run() {
		for(int i=1; i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("child thread");
		}
	}
}
public class D7_Runnable {

	public static void main(String[] args) throws InterruptedException {
		B b = new B();
		Thread t = new Thread(b);
		t.start();
		for(int j=1;j<=5;j++) {
			Thread.sleep(1000);
			System.out.println("main thread");
		}

	}

}
