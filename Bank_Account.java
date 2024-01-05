/*Task Number: 3

1.Create a class to represent 1. the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.

*/

package task_3;

import java.util.*;

class ATM extends Bank_Account {
	
	public void Check()
	{
		System.out.println("Current Balance: "+Balance);
		System.out.println("Your Transcantion is Successful!!!");
	}
	
	public void Withdraw(float Amount) {
		
		if(Balance>=1000+Amount) {
		Balance= Balance-Amount;
		System.out.println("Amount Withdrawed: "+Amount+"\nCurrent Balance: "+Balance);
		System.out.println("Your Transcantion is Successful!!!");
		}
		else {
			System.out.println("Low Bank Balance\nYou Can't Withdraw Money!!!");
		    System.out.println("Your Transcantion is Failed!!!");
		}  
	}
	
	public void Deposit(float Amount) {
		Balance= Balance+Amount;
		System.out.println("Amount Deposited: "+Amount+"\nCurrent Balance: "+Balance);
		System.out.println("Your Transcantion is Successful!!!");
	}
}

public class Bank_Account {
	
	
	float Balance=1000;
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		ATM a = new ATM();
		float Amount;
		System.out.println("ATM INTERFACE");
		int choice,ch;
		do {
			System.out.println("Operations:\n1.Check Account Balance\n2.Withdraw\n3.Deposit");
			System.out.print("Enter Your Choice:");
		    choice= S.nextInt();
		    
		    switch(choice)
		    {
		    case 1:
		    	a.Check();
		    	break;
		    	
		    case 2:
		    	System.out.print("Enter the Amount: ");
		    	Amount= S.nextFloat();
		    	a.Withdraw(Amount);
		    	break;
		    	
		    case 3: 
		    	System.out.print("Enter the Amount:");
		    	Amount= S.nextFloat();
		    	a.Deposit(Amount);
		    	break;
		    	
		    default:
		    	System.out.println("Invalid Choice!!!");
		    }
		    
		    System.out.print("Enter 1 to continue:");
		   ch= S.nextInt();
		    
		}while(ch==1);
		
		System.out.println("Thank You!!!");
		S.close();
	}
}

