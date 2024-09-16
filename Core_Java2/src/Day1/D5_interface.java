package Day1;
interface Test{
	int a=10; //by default static, final, public
	void display(); //public and abstract
	
}

public class D5_interface implements Test{
	public void display() {
		System.out.println("value is "+a);
	}

	public static void main(String[] args) {
		Test obj = new D5_interface();
		obj.display();

	}

}
