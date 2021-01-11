package java8_features;

public class AnonymousInnerClass {
	public static void main(String[] args) {
		//		Runnable r = new Runnable() {
		//			public void run() {
		//				for(int i=0; i<10; i++) {
		//					System.out.println("child thread");
		//				}
		//			}
		//		};
		Runnable r = () -> {for(int i=0; i<10; i++) {
			System.out.println("child thread");
		}};
		Thread t = new Thread(r);
		t.start();
		System.out.println("No of thread is: " + Thread.activeCount());
		for(int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
	}
}
