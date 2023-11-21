package Exception;

class demo2 extends Thread {

	public void run() {
		System.out.println("child thread");

	}
}

public class priority {

	public static void main(String[] args) {
		demo2 d = new demo2();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);// to set the priority of main class
		System.out.println(Thread.currentThread().getPriority());

		System.out.println(d.currentThread().getPriority());// child thread follows the parent thread
     }
}
