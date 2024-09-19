package inheritance;

public class B extends A {

	public void write() {

		System.out.println("Writing");

	}

	public static void main(String[] args) {

		B obj = new B();
		obj.read();
		obj.write();

	}
}
