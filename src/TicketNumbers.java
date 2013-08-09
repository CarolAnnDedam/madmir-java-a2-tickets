import java.util.Scanner;


public class TicketNumbers {

	public static void main(String[] args) {
	
			int ticketNumber = 111111;
			int stem, checkDigit;
					Scanner sc = new Scanner(System.in);
		while ( ticketNumber != 000000) {
			System.out.println("Please enter a six-digit ticket number; ");
			ticketNumber = sc.nextInt();
			stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;
			
			while (checkDigit != stem % 7) {
				System.out.println("That is NOT a valid ticket number!");
				System.out.println("try again" );
				ticketNumber = sc.nextInt();
				stem = ticketNumber / 10;
				checkDigit = ticketNumber % 10;
			   }
			System.out.println("that is a valid ticket number, well done");
			}
			System.out.println("Thanks for using the Ticket check");
		}

	}