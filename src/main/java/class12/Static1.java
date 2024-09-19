package class12;

public class Static1 {

	String name;
	int roll;
	static String collage = "Avinuty";

	// constructor
	Static1(String n, int r) {
		roll = r;
		name = n;
	}

	public void display() {
		System.out.println("Name :" + name + " Roll: " + roll + " Collage: " + collage);
	}

	public static void main(String[] args) {

		Static1 obj = new Static1("Deepika", 123);
		obj.display();
		// Static variable can also be modified as below with class name 
		Static1.collage = "Deemed";

		Static1 obj2 = new Static1("Siana", 456);
		obj2.display();

	}
}