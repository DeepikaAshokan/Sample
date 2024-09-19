package inheritance;

public class Overriding2 extends Overriding1 {

	public void run() {
		System.out.println("Running keeps body fit");
	}

	public static void main(String[] args) {

		Overriding2 obj = new Overriding2();

		obj.run();

		Overriding1 obj1 = new Overriding1();

		obj1.run();

	}

}
