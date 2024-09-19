package class12;

public class Service1 implements Client1 {

	public static void main(String[] args) {

		Service1 obj = new Service1();

		obj.displaay();

		System.out.println("Variable in interface is static we can call the variable directly without obj :"
				+ Client1.pi);

	}

	public void displaay() {

		System.out.println("The valus of pi is " + pi);
	}

}
