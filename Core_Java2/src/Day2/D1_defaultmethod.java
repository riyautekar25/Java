package Day2;
interface A{
	void a1();
	void a2();
	default void a3() {
		System.out.println("may or may not override in implementing class");
	}
}
class B implements A{
	public void a1() {
		System.out.println("a1 method");
	}
	
	public void a2() {
		System.out.println("a2 method");
	}
	
	public void a3() {
		System.out.println("override in class B");
	}
}

class C implements A{
	public void a1() {
		System.out.println("a1 method in class c");
	}
	
	public void a2() {
		System.out.println("a2 method in class C");
	}
}
public class D1_defaultmethod {

	public static void main(String[] args) {
		B b = new B();
		b.a1();
		b.a2();
		b.a3();
		C c= new C();
		c.a1();
		c.a2();
		c.a3();
		

	}

}
// default methods in interface
// before jdk 1.8 interface in java could only contain public and abstract and all these methods had to be implemented by any class that implemented the interface
// from 1.8 jdk onwards interface can  have static and default methods
// advantage 
// allows adding new methods to interface without breaking existing implementations
// enables sharing common code across multiple classes 
