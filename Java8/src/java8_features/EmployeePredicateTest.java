package java8_features;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicateTest {
	public static void main(String[] args) {
		ArrayList<EmployeePredicate> l = new ArrayList<EmployeePredicate>();
		l.add(new EmployeePredicate("Amit", 10000));
		l.add(new EmployeePredicate("Aarti", 20000));
		l.add(new EmployeePredicate("Hiyan", 30000));
		l.add(new EmployeePredicate("Ravi", 1000));
		l.add(new EmployeePredicate("Sagar", 100));
		// list employees who's salary is more than 10000
		Predicate<EmployeePredicate> p = eachEmployee -> eachEmployee.salary >= 10000;
		for(EmployeePredicate ep : l) {
			if(p.test(ep)) {
				System.out.println(ep.name + " : " + ep.salary);
			}
		}
		for(EmployeePredicate ep : l) {
			if(ep.salary >= 10000) {
				System.out.println(ep.name + " : " + ep.salary);
			}
		}
	}
}
