package Day1;
abstract class Anonymous{
	public abstract void my_method();
	
}
public class D4_Outer {

	public static void main(String[] args) {
		Anonymous inner = new Anonymous() {
			public void my_method() {
				System.out.println("This is example for the inner anonymous class");
			}
		};
		inner.my_method();

	}

}

