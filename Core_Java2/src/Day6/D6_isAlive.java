package Day6;
class A3 extends Thread{
	public void run() {
		System.out.println("thread alive checking");
	}
}
public class D6_isAlive {

	public static void main(String[] args) {
		A3 t1 = new A3();
		A3 t2 = new A3();
		A3 t3 = new A3();
		System.out.println(t1.isAlive());
		t1.start();
		System.out.println(t1.isAlive());
		

	}

}
