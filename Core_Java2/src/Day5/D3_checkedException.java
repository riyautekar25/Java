package Day5;

public class D3_checkedException {

	public static void main(String[] args) {
		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program finished...");
		System.out.println("Program exited...");

	}

}
