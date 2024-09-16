package Day2;
interface Cab1{
	public void bookcab();
}

public class D3_lambdaexpression {

	public static void main(String[] args) {
		Cab1 cab = ()->System.out.println("Ola cab is booked");
		cab.bookcab();

	}

}
