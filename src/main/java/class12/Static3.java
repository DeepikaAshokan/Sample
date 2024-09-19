package class12;

import java.util.Scanner;

public class Static3 {
	
	static String name ;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name :");
		name = sc.next();
		
		Static3 s3 = new Static3();

System.out.println(name);
System.out.println(Static3.name);
System.out.println(s3.name);
	}

}
