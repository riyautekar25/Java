package Day2;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int sal;
	int exp;

	Employee(String name, int salary, int exp) {
		this.ename = name;
		this.sal = salary;
		this.exp = exp;
	}
}

public class D7_predicate {

	public static void main(String[] args) {
		Employee emp = new Employee("Siri", 50000, 6);
		Predicate<Employee> pr = e -> (e.sal > 40000 && e.exp > 3);
		System.out.println(pr.test(emp));
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(new Employee("John", 40000, 5));
		a1.add(new Employee("David", 50000, 4));
		a1.add(new Employee("Jack", 60000, 3));
		for(Employee e:a1) {
			if(pr.test(e)) {
				System.out.println(e.ename);
			}
		}
	}

}
