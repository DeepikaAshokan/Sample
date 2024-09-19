package inheritance;

public class Abstract2 extends Abstract1 {

	public static void main(String[] args) {

Abstract2 obj = new Abstract2();

obj.read();
obj.write();

}

@Override
	void read() {
		System.out.println("Read with correct pronunciation");
	}

}
