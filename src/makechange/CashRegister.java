package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double amountDue;
		
		double amountPaid;
		
		double changeDue;
		
		//prompt the user to enter the price.
		System.out.println("What is the price of the item?: ");
		amountDue = sc.nextDouble();
		
		System.out.println("How much will you be paying?: ");
		amountPaid = sc.nextDouble();
		//Keep asking user until enough amount is given.
		while(amountPaid < amountDue) {
			System.out.println("That is not enough please check again!");
			System.out.println("How much are you will you be paying?: ");
			amountPaid = sc.nextDouble();
		}
		
		if(amountPaid > amountDue) {
			changeDue = amountPaid - amountDue;
			
			
		System.out.print("Your Change is: ");
		int twentyOwed = (int)(changeDue / 20);
		changeDue -= twentyOwed * 20;
		if(twentyOwed > 1) {
			System.out.print(twentyOwed + " Twenty dollars ");
		} else if(twentyOwed == 1) {
			System.out.print(twentyOwed + " Twenty dollar ");
		}
		int tensOwed = (int)(changeDue / 10);
		changeDue -= tensOwed * 10;
		if(tensOwed > 1) {
			System.out.print(tensOwed + " Ten dollars ");
		} else if(twentyOwed == 1) {
			System.out.print(tensOwed + " Ten dollar ");
		}
		
		int fivesOwed = (int)(changeDue / 5);
		changeDue -= fivesOwed * 5;
		if(fivesOwed > 1) {
			System.out.print(fivesOwed + " Five dollars ");
		} else if(fivesOwed == 1) {
			System.out.print(fivesOwed + " five dollar ");
		}
		
		int onesOwed = (int)(changeDue / 1);
		changeDue -= onesOwed;
		if(onesOwed > 1) {
			System.out.print(onesOwed + " One dollars ");
		} else if(onesOwed == 1) {
			System.out.print(onesOwed + " One dollar ");
		}
		
		changeDue = changeDue * 100.0;
		
		int quarterOwed = (int)(changeDue / 25);
		changeDue -= quarterOwed * 25;
		if(quarterOwed > 1) {
			System.out.print(quarterOwed + " Quarters ");
		} else if(twentyOwed == 1) {
			System.out.print(quarterOwed + " Quarter ");
		}
		
		int dimeOwed = (int)(changeDue / 10);
		changeDue -= dimeOwed * 10;
		
		if(dimeOwed > 1) {
			System.out.print(dimeOwed + " Dimes ");
		} else if(twentyOwed == 1) {
			System.out.print(dimeOwed + " Dime ");
		}
		
		int nickelOwed = (int)(changeDue / 5);
		changeDue -= nickelOwed * 5;
		
		if(nickelOwed > 1) {
			System.out.print(nickelOwed + " Nickels ");
		} else if(twentyOwed == 1) {
			System.out.print(nickelOwed + " Nickel ");
		}
		int pennyOwed = (int)(changeDue / 1);
		changeDue -= pennyOwed * 1;
		if(pennyOwed > 1) {
			System.out.print(pennyOwed + " Pennies. ");
		} else if(twentyOwed == 1) {
			System.out.print(pennyOwed + " Penny. ");
		}
		
		// end if there are no changes needed.
		} else if(amountPaid == amountDue) {
			System.out.println("Thank you for purchasing there will be no change.");
		}
		sc.close();
	}

}
