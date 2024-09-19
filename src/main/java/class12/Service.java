package class12;

import java.util.Scanner;

public class Service implements Client {

	String name;
	int age;

	public static void main(String[] args) {

		// obj can't be created to interface but reference can be created to interface 

		Client obj = new Service();
		obj.accept();
		obj.display();
	}

	public void accept() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		name = sc.nextLine();
		System.out.println("Enter the age");
		age = sc.nextInt();
	}

	public void display() {

		System.out.println("Name: " + name + " Age: " + age);
	}

}
