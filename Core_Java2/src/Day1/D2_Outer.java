package Day1;

public class D2_Outer {
	int a=30;
	private int b=25;
	static int c=40;
	//member inner class
	class inner{
		public void sum() {
			System.out.println("Sum is: "+(a+b+c));
		}
	}

	public static void main(String[] args) {
		D2_Outer out = new D2_Outer();
		D2_Outer.inner obj = out.new inner();
		obj.sum();
		//using single line
		D2_Outer.inner ob =new D2_Outer().new inner();
		ob.sum();

	}

}
