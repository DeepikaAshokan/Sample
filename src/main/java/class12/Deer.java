package class12;

public class Deer extends Animal {

	public void eat() {
		System.out.println("Deer eat plants");
	}

	public static void main(String[] args) {

		Lion l1 = new Lion();
		l1.eat();
		Dog d1 = new Dog();
		d1.eat();
		Deer E1 = new Deer();
		E1.eat();

	}

}
