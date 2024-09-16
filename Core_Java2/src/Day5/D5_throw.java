package Day5;

public class D5_throw {
	public static void main(String[] args) throws InterruptedException{
		int a=20;
		int b=0;
		if(b==0) {
			throw new ArithmeticException("can not divide by 0");
		}
		else {
			int res=a/b;
			System.out.println(res);
		}

	}
}


// Java Multi-threading 
// Multitasking - 1. Process Based: Ex. Listening music, editing ppt, or creating a document in word, downloading 
// 									- here task belongs to different program
//				  2. Thread Based: - within one program multiple threads running parallel
//								   - threads are independent 

// What is thread ?
// Thread is a predefined class, available in java.lang package
// Thread is basic unit of CPU and well known for independent execute
// How to create thread in java ?
// 1. By extending thread class
// 2. By implementing runnable interface