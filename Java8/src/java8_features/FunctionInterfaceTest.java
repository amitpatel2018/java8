package java8_features;

import java.util.function.Function;

public class FunctionInterfaceTest {
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, Integer> f2 = s -> s.length();
		System.out.println("Uppercase of Amit is: " + f1.apply("Amit"));
		System.out.println("length of Amit is: " + f2.apply("Amit"));
		System.out.println(f1.andThen(f2).apply("Amit"));
		
		Function<Integer, Integer> f3 = i -> 2 * i;
		Function<Integer, Integer> f4 = i -> i*i*i;
		System.out.println("andThen method result is : " + f3.andThen(f4).apply(2));
		System.out.println("Compose method result is: " + f3.compose(f4).apply(2));
	}
}
