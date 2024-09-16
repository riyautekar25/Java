package Day5;
class A extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Riya");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class D6_Thread1 {

	public static void main(String[] args) {
		A t = new A();
		t.start();
		for(int j =1; j<=5; j++) {
			System.out.println("Siri");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
// There are two tasks in the above code, both are running parallel
