package assignment05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(",");
        
        String stageEvent = parts[0];
        String customer = parts[1];
        int noOfSeats = Integer.parseInt(parts[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        int choice = sc.nextInt();
        sc.nextLine(); 

        booking.displayBooking();

        switch (choice) {
            case 1: 
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;

            case 2: 
                double walletAmount = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                booking.makePayment(walletAmount, walletNumber);
                break;

            case 3: 
                String cardHolder = sc.nextLine();
                double cardAmount = sc.nextDouble();
                sc.nextLine();
                String cardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(cardHolder, cardAmount, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
	}

}
