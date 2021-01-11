package java8_features;
// to use lambda expression, you must use functional interface
public class LambdaExpression {
	public static void main(String[] args) {
		FunctionalInterface fi = () -> System.out.println("Hello");
		fi.m1();

		Runnable r = ()->{for(int i=0; i<10; i++) 
		{System.out.println("child thread");}
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
	}
}
