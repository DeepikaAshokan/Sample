package inheritance;

public class parameterizedConstructor {

	String name;

	String place;

	public parameterizedConstructor() {
		System.out.println("this is a default constructor");
	}

	parameterizedConstructor(String a, String b) {
		name = a;
		place = b;

		System.out.println(name + " " + place);
	}

	public static void main(String[] args) {

		parameterizedConstructor pc1 = new parameterizedConstructor();

		parameterizedConstructor pc = new parameterizedConstructor("Deepika", "Coimbatore");

		parameterizedConstructor pc0 = new parameterizedConstructor("Siana", "Coimbatore");

	}

}
