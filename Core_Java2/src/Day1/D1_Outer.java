package Day1;

public class D1_Outer {
	static int a=20;
	public static void display() {
		System.out.println(a);
	}
	//static inner class
	static class inner{
		static void show() {
			System.out.println("Inner static class");
			System.out.println("value of a: "+a);
		}
	}

	public static void main(String[] args) {
		System.out.println(D1_Outer.a);
		D1_Outer.display();
		D1_Outer.inner.show();
		inner in = new inner();
		in.show();

	}

}
