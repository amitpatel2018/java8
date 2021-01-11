package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Consumer;


public class StreamToList {
	// filter(Predicate) - boolean
	// map(Function) - any return value
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		List<Integer> sortedList = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println("Even numbers are: ");
		for(Integer i : sortedList) {
			System.out.print((i + " | "));
		}
		System.out.println();
		List<Integer> l1 = l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("After adding 5, result is: ");
		for(Integer i : l1) {
			System.out.print(i + "|");
		}
		System.out.println();
		var x = 10;
		System.out.println(x);
		List<Integer> l4 = l.stream().filter(i->i%2==0).map(i->i+3).collect(Collectors.toList());
		System.out.println(l4);
		// this is natural sorting order
		// if you want reverse then simply put - (Minus) before compareTo method
		// or write as "obj2.compareTo(obj1)"
		Integer minValue = l.stream().min((obj1, obj2)->obj1.compareTo(obj2)).get();
		System.out.println("Min value is: " + minValue);
		Integer maxValue = l.stream().max((obj1, obj2)->obj1.compareTo(obj2)).get();
		System.out.println("Max value is: " + maxValue);
		
		Consumer<Integer> c = i -> System.out.println("the square of " + i + " is: " + i*i);
		l.stream().forEach(c);
		
		Integer[] iArray = l.stream().toArray(Integer[]::new);
		System.out.println("Printing Array elements");
		Stream.of(iArray).forEach(System.out::println);
	}
}
