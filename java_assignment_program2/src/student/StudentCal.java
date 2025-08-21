package student;

import java.util.Scanner;

class Student {
	public Student() {
		System.out.println("Student object is created");
		}
	}
	
	//Commission class
class Commission {
	private String name, address, phone;
	private double salesAmount;
	
	 // Accept details from user
	public void acceptDetails() {
	    Scanner s = new Scanner(System.in);

	    System.out.print("Enter Name: ");
	    name = s.nextLine();    
	     
	    System.out.print("Enter Address: ");
	    address = s.nextLine();
	
	    System.out.print("Enter Phone: ");
	    phone = s.nextLine();
	
	    System.out.print("Enter Sales Amount: ");
	    salesAmount = s.nextDouble();
	}
	
	 // Calculate and print commission
	public void calculateCommission() {
	    double commission;
	
	    if (salesAmount >= 100000) {
	        commission = salesAmount * 0.10;
	    } else if (salesAmount >= 50000) {
	        commission = salesAmount * 0.05;
	    } else if (salesAmount >= 30000) {
	        commission = salesAmount * 0.03;
	    } else {
	        commission = 0;
	    }
	
	    System.out.println("Commission for " + name + " is: " + commission);
	}
}
public class StudentCal {
	public static void main(String[] args) {
        // Create Student object
        var s1 = new Student();

        // Create Commission object and use methods
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }

}
