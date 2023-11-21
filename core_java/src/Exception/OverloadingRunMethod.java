package Exception;

class Sample1 extends Thread {
	public void run() {
		System.out.println("no args run method");
	}

	public void run(int i) {
		System.out.println("args run method");
	}
}

public class OverloadingRunMethod {

	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.start();
	}
}
