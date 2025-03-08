package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double amountDue;
		
		double amountPaid;
		
		double changeDue;
		
		System.out.println("What is the price of the item?: ");
		amountDue = sc.nextDouble();
		
		System.out.println("How much will you be paying?: ");
		amountPaid = sc.nextDouble();
		
		while(amountPaid < amountDue) {
			System.out.println("That is not enough please check again!");
			System.out.println("How much are you will you be paying?: ");
			amountPaid = sc.nextDouble();
		}
		
		if(amountPaid > amountDue) {
			changeDue = amountPaid - amountDue;
			
		int twentyOwed = (int)(changeDue / 20);
		changeDue = (int) changeDue - (twentyOwed * 20);
		
		int tensOwed = (int)(changeDue / 10);
		changeDue = (int) changeDue - (tensOwed * 10);
		
		int fivesOwed = (int)(changeDue / 5);
		changeDue = (int) changeDue - (fivesOwed * 5);
		
		int onesOwed = (int)(changeDue / 1);
		changeDue = (int)(changeDue - onesOwed);
		
		changeDue = changeDue * 100.0;
		
		int quarterOwed = (int)(changeDue / 25);
		changeDue = (int) changeDue - (quarterOwed * 25);
			System.out.println(twentyOwed + " and " + fivesOwed + " and " + onesOwed);
		} else if(amountPaid == amountDue) {
			System.out.println("Thank you for purchasing there will be no change.");
		}
		sc.close();
	}

}
