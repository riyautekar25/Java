package Day3;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class D2_consumer {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice","Bob","Merry","Siri");
		Consumer<String> pr = name->{
			System.out.println(name);
		};
		names.forEach(pr);

	}

}



//Predefined functional interface
//consumer
//- abstract method as accept()
//- it accept argument but does not return any value 


