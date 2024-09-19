package inheritance;

public class pen1 {

	String color;
	String type;

	pen1(String color, String type) {

		this.color = color;
		this.type = type;
	}

	public void write() {
		System.out.println(color + "  " + type);

	}

	public static void main(String[] args) {

		pen1 obj = new pen1("blue", "ball");

		obj.write();

		pen1 obj2 = new pen1("pink", "gel");

		obj2.write();
		pen1 obj1 = new pen1("yellow", "ink");
		obj1.write();

	}

}
