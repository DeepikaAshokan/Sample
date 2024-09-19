package class12;

public class Static2 {

	int x = 10;
	static int y = 20;

	public static void a() {
		y=18;
		System.out.println(y);
	}

	public void b() {
		int y = 15;
		System.out.println(y);
		// calling static method inside non static method
		a();
	}

	public static void main(String[] args) {

		a();
		Static2 s2 = new Static2();
		s2.b();
	}

}
