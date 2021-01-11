package java8_features;

public class Theory {
	public static void main(String[] args) {
		String name = "Case Created: this is long subject name as I am trying to test action name, w...";
		System.out.println(name.length());
	}
}

/*
 * Take some input and perform some conditional check and return boolean value -> Predicate
 * Take some input and perform some operation and return the result which is need not be boolean type -> Function
 * Accept some input and perform required operation and not required to return anything -> Consumer
 * Just supply my required objects and it won't take any input -> Supplier
 * Predicate -> test()
 * Function -> apply()
 * Consumer -> accept()
 * Supplier -> get()
 * */

/*
 * Streams methods
 * 1. stream() - apply on collection object
 * 2. filter(Predicate)
 * 3. map(Function)
 * 4. count() - directly apply on stream() - l.stream().filter(Predicate).count(); - returns long
 * 5. sorted() - natural sorting collection objects - l.stream().sorted().collect(Collectors.toList());
 * 6. sorted(Comparator(obj1, obj2)) - descending sorting order
 * 7. min(Comparator) - returns min value
 * 8. max(Comparator) - returns max value l.stream().max((obj1, obj2)->obj1.compareTo(obj2)).get();
 * 9. forEach(Consumer)
 */
