package Day1;

public class D3_Outer {
	public void show() {
		System.out.println("Outer class");
		
	}
	void my_method() {
		int num=25;
		class inner{
			public void print() {
				System.out.println("Inside the inner class"+num);
			}
		}
		inner in = new inner();
		in.print();
	}

	public static void main(String[] args) {
		D3_Outer out = new D3_Outer();
		out.my_method();
		out.show();

	}

}
