package java8_features;

public class DoubleColon {
	public static void m1() {
		for(int i=0; i<10; i++) {
			System.out.println("Child thread");
		}
	}
	public void m2() {
		System.out.println("instance method");
	}
	public static void main(String[] args) {
		// :: used for method or constructor reference
		// for static method = classname::methodname
		// for instance method = objectreference::methodname
		Runnable r = DoubleColon::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
		DoubleColon dc = new DoubleColon();
		r = dc::m2;
		t = new Thread(r);
		t.start();
	}
}
