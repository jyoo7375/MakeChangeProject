package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amountDue;
		double amountPaid;
		double changeDue;
		
		// Prompt the user to enter the price.
		System.out.println("What is the price of the item?: ");
		amountDue = sc.nextDouble();
		
		System.out.println("How much will you be paying?: ");
		amountPaid = sc.nextDouble();
		// Keep asking user until enough amount is given.
		while(amountPaid < amountDue) {
			System.out.println("That is not enough please check again!");
			System.out.println("How much will you be paying?: ");
			amountPaid = sc.nextDouble();
		}
		
		//Calculate the change due once right amount has been given.
		if(amountPaid > amountDue) {
			changeDue = amountPaid - amountDue;
			
			//Calculate the twenty dollar.
			System.out.print("Your Change is:");
			int twentyOwed = (int)(changeDue / 20);
			changeDue -= twentyOwed * 20;
			if(twentyOwed == 1) {
				System.out.print("" + twentyOwed + " Twenty dollar ");
			} else if(twentyOwed > 1) {
				System.out.print("" + twentyOwed + " Twenty dollars ");
			}
			
			//Calculate the ten dollar.
			int tensOwed = (int)(changeDue / 10);
			changeDue -= tensOwed * 10;
			if(tensOwed == 1) {
				System.out.print("" + tensOwed + " Ten dollar ");
			} else if(tensOwed > 1) {
				System.out.print("" + tensOwed + " Ten dollars ");
			}
			
			//Calculate the five dollar.
			int fivesOwed = (int)(changeDue / 5);
			changeDue -= fivesOwed * 5;
			if(fivesOwed == 1) {
				System.out.print("" + fivesOwed + " Five dollar ");
			} else if(fivesOwed > 1) {
				System.out.print("" + fivesOwed + " Five dollars ");
			}
			
			//Calculate the one dollar.
			int onesOwed = (int)(changeDue / 1);
			changeDue -= onesOwed;
			if(onesOwed == 1) {
				System.out.print("" + onesOwed + " One dollar");
			} else if(onesOwed > 1) {
				System.out.print("" + onesOwed + " One dollars");
			}
			
			changeDue = Math.round(changeDue * 100);
			
			//Calculate the quarter.
			int quarterOwed = (int)(changeDue / 25);
			changeDue -= quarterOwed * 25;
			if(quarterOwed == 1) {
				System.out.print(" " + quarterOwed + " Quarter");
			} else if(quarterOwed > 1) {
				System.out.print(" " + quarterOwed + " Quarters");
			}
			
			//Calculate the dime.
			int dimeOwed = (int)(changeDue / 10);
			changeDue -= dimeOwed * 10;
			if(dimeOwed == 1) {
				System.out.print(" " + dimeOwed + " Dime");
			} else if(dimeOwed > 1) {
				System.out.print(" " + dimeOwed + " Dimes");
			}
			
			//Calculate the nickel.
			int nickelOwed = (int)(changeDue / 5);
			changeDue -= nickelOwed * 5;
			if(nickelOwed == 1) {
				System.out.print(" " + nickelOwed + " Nickel");
			} else if(nickelOwed > 1) {
				System.out.print(" " + nickelOwed + " Nickels");
			}
			
			//Calculate the penny.
			int pennyOwed = (int)(changeDue / 1);
			changeDue -= pennyOwed;
			if(pennyOwed == 1) {
				System.out.print(" " + pennyOwed + " Penny");
			} else if(pennyOwed > 1) {
				System.out.print(" " + pennyOwed + " Pennies");
			}
			
			//add the period for the last 
			System.out.print(".");
			
			
			//if there are no change to be given exit the program.
		} else if(amountPaid == amountDue) {
			System.out.println("Thank you for purchasing there will be no change.");
		}
		sc.close();
	}
}