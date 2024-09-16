package Day5;

public class D2_finallyblock {

	public static void main(String[] args) {
		//String s = null;
		String s = "welcome";
		try{
			System.out.println(s.length());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Program completed...");
		}

	}

}


// Checked exception
// Checked exception can be handle in two ways - 1. using try catch block
//												 2. using throws
// 