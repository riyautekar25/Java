//lambda expression with arguments 
package Day2;

interface Cab2 {
	public void bookcab(String source, String dest);
}

public class D4_lambdaexp2 {

	public static void main(String[] args) {
		Cab2 cab = (source, dest) -> System.out.println("Travelling from " + source + " to " + dest);
		cab.bookcab("Mumbai", "Pune");

	}

}
