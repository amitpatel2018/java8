package java8_features;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceTest {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bi = (num1, num2) -> (num1+num2)%2==0;
		
		System.out.println(bi.test(11, 20));
	}
}
