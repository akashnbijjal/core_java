package Exception;

class demo implements Runnable {

	public void run() {
		System.out.println("child thread");
	}
}

public class Myrunnable {

	public static void main(String[] args) {
		demo d1 = new demo();
		Thread t1 = new Thread();
		Thread t2 = new Thread(d1);
		t1.run();
		System.out.println("main thread");
	}
}
