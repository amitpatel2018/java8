package java8_features;

import java.util.stream.Stream;

public class StreamOfOperations {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		s.forEach(System.out::println);
		String[] s1 = {"Amit", "Aarti", "Hiyan"};
		Stream.of(s1).forEach(System.out::println);
	}
}
