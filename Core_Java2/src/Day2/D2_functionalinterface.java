package Day2;
@FunctionalInterface
interface Cab{
	public void bookCab();
}

class Ola implements Cab{
	public void bookCab() {
		System.out.println("Ola cab is booked");
	}
}
public class D2_functionalinterface {

	public static void main(String[] args) {
		Ola cab = new Ola();
		cab.bookCab();

	}

}




// why do we need lambda expression
// oops does not have functional program
// to bring the functional programming in java and code optimization/ concise code.
// what is lambda expression?
// lambda expression is anonymous function
// anonymous function: nameless, does not have return type, no access modifier
// normal method:
// public void m1(){
//  s.o.p("welcome");
//}
// lambda expression:
//()->{s.o.p("welcome")};
//()->s.o.p("welcome");------for function having only one statement
//example 2: 
//normal method:
//public void m1(int a, int b){
//s.o.p(a+b);
//}
//lambda expression:
// (int a, int b)->s.o.p(a+b);
//(a,b)->s.o.p(a+b);
//example 3:
//how to return value
//normal method:
//public int m1(int a){
//  return (a*a);
//}
// lambda expression:
//(int a)->{return (a*a);};
//(a)->a*a;



// functional interface
// support single abstract method(SAM)
// but allows any number of default methods and static methods
// lambda expression can be invoked through functional interface only