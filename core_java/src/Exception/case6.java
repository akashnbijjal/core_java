package Exception;

class Mythread1 extends Thread {
	public void run() {
		System.out.println("run method");
	}
}

public class case6 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Mythread1 m = new Mythread1();
		System.out.println(m.getName());
		Mythread1 m2 = new Mythread1();
		System.out.println(m2.getName());
		
	}
}
