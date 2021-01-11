package java8_features;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionInterfaceTest {
	public static void main(String[] args) {
		BiFunction<String, Integer, EmployeePredicate> bi = (name, salary) -> 
							new EmployeePredicate(name, salary);
		ArrayList<EmployeePredicate> l = new ArrayList<EmployeePredicate>();
		l.add(bi.apply("Amit", 10000));
		l.add(bi.apply("Aarti", 2000));
		System.out.println(l.get(0).name);
		System.out.println(l.get(0).salary);
		for(EmployeePredicate e : l) {
			System.out.println(e.name + " : " + e.salary);
		}
	}
}
