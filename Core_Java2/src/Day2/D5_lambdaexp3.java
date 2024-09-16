package Day2;
interface Auto{
	public String bookAuto(String s, String d);
}

public class D5_lambdaexp3 {

	public static void main(String[] args) {
		Auto auto = (String s,String d)->{
				System.out.println("Travelling from " + s + " to " + d);
		return ("price:500");
		};
		
		System.out.println(auto.bookAuto("Bengalore", "Pune"));

	}

}


