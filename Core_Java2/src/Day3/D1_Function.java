package Day3;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
	String name;
	int sal;

	Employee(String name, int sal) {
		this.name = name;
		this.sal = sal;
	}
}

public class D1_Function {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("David", 50000));
		emp.add(new Employee("John", 40000));
		emp.add(new Employee("Siri", 60000));
		Function<Employee, Integer> pr = e -> {
			int sal = e.sal;
			if (sal > 10000 && sal <= 30000) {
				return (sal * 10 / 100);
			} else if (sal > 10000 && sal <= 20000) {
				return (sal * 20 / 100);
			} else if (sal > 30000 && sal <= 50000) {
				return (sal * 40 / 100);
			} else {
				return (sal * 30 / 100);
			}
		};
		for(Employee emp_obj:emp) {
			int bonus = pr.apply(emp_obj);
			System.out.println("Emplyee name: "+emp_obj.name+" Salary: "+emp_obj.sal+" Bonus: "+bonus);
		}
	}
}

//Predefined functional interface
//Function
//- having method called apply();
//interface Function <T,R>
//{
//return apply(T);
//}