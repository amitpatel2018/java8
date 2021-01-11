package java8_features;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerInterfaceTest {
	// return type is void so if you want to print something then use Consumer interface
	public static void main(String[] args) {
		Consumer<EmployeePredicate> c = e -> System.out.println(e.name + " : " + e.salary);
		Predicate<Double> p = salary -> salary > 20000;
		
		ArrayList<EmployeePredicate> l = new ArrayList<EmployeePredicate>();
		l.add(new EmployeePredicate("Amit", 20000));
		l.add(new EmployeePredicate("Aarti", 50000));
		for(EmployeePredicate eachEmployee : l) {
			if(p.test(eachEmployee.salary)) {
				c.accept(eachEmployee);
			}
		}
	}
}
