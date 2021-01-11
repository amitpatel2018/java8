package java8_features;
//@FunctionalInterface
// functional interface contains only 1 abstract method 
// functional interface can contain any number of default and static methods
public interface FunctionalInterface {
	public abstract void m1();
	default void m2() {
		System.out.println("I am inside default method of interface");
	}
	static void m3() {
		System.out.println("I am inside static method of interface");
	}
}
