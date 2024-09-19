package class12;

public class StaticDemo {

	int x = 100; // Global variable
	static int y = 200; // Static Variable
	String str = "Deepika and Siana"; // non-static variable

	// static method
	public static void func() {
		System.out.println("A STATIC method/function");
	}

	public void func1() {
		System.out.println("NON_STATIC method/function");
	}

	public static void main(String[] args) {
//calling static method and variable without obj
		func();
		System.out.println(y);
		// calling Static method with obj
		StaticDemo obj = new StaticDemo();
		obj.func1();
		obj.func();
		System.out.println(obj.y);
	}

}
