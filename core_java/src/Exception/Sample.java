package Exception;

class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("child thread");
		}
	}
}

public class Sample {

	public static void main(String[] args) {

		Mythread m = new Mythread(); //Thread instantiation
		m.run();//starting of a thread
		for (int i = 0; i < 4; i++) {
			System.out.println("main thread");
		}
	
	}

}
