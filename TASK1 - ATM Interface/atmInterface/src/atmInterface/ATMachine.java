/**
 * 
 */
package atmInterface;

import java.util.Scanner;

/**
 * 
 */

class ATM {
	public float balance;
	public int PIN = 5768;
	
	public void checkpin() {
		System.out.println("Enter your Pin: ");
		Scanner sc = new Scanner(System.in);
		int userPin = sc.nextInt();
		if(userPin == PIN) {
			menu();
		}
		else {
			System.out.println("Enter valid pin");
			checkpin();
		}
			
	}
	
	public void menu() {
		System.out.println("Enter your choice from the options: ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Quit");

		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt == 1) {
			checkBalance();
		}else if(opt == 2){
			withdrawMoney();
		}else if(opt == 3) {
			depositMoney();
		}else if(opt == 4) {
			System.out.println("Thank you. Visit Again!");
			return;
		}else {
			System.out.println("Enter a valid choice.");
		}
	}
	
	public void endOfAct() {
		System.out.println("What do yoou want to do next?");
		System.out.println("1. Go to Main Menu");
		System.out.println("2. Exit application");
		
		Scanner sc = new Scanner(System.in);
		int taskOpt = sc.nextInt();
		
		if(taskOpt == 1) {
			menu();
		}else if(taskOpt == 2) {
			return;
		}else {
			System.out.println("Enter a valid choice");
			endOfAct();
		}
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: " + balance);
		endOfAct();
		
	}
	
	public void withdrawMoney() {
		System.out.println("Enter amout to withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amt = sc.nextFloat();
		
		if(amt>balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance = balance - amt;
			System.out.println("Rs." + amt + " is withdrawn from the account");
		}
		
		endOfAct();
	}
	
	public void depositMoney() {
		System.out.println("Enter amount you wish to deposit: ");
		Scanner sc = new Scanner(System.in);
		float damt = sc.nextFloat();
		balance = balance + damt;
		System.out.println("Rs."+ damt + " is deposited in your account");
		
		endOfAct();
		
	}
}
public class ATMachine {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		ATM obj = new ATM();
		obj.checkpin();


	}

}
