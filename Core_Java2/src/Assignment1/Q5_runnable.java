package Assignment1;
// 5. Write a java to create a thread by implementing the ‘Runnable’ interface. The thread should print the squares of numbers from 1to 5.
class square implements Runnable{
	public void run() {
		for (int i = 1; i<=5; i++) {
			System.out.println("sqaure of "+i+" is "+(i*i));
		}
	}
}
public class Q5_runnable {

	public static void main(String[] args) {
		square obj = new square();
		Thread thread = new Thread(obj);
		thread.start();

	}

}
