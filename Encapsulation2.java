package encapsulation;

import java.util.Scanner;

public class Encapsulation2 {
		void display() {
			Encapsulation obj = new Encapsulation();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your rollnumber");
			obj.setRollNumber(sc.nextInt());
			System.out.println("enter your name");
			obj.setName(sc.next());
			System.out.println("rollnumber==>"+obj.getRollNumber());
			System.out.println("name===>"+obj.getName());
			
		}

		public static void main(String[] args) {
			Encapsulation2 obj2 = new Encapsulation2();
			
			obj2.display();

		}

}
