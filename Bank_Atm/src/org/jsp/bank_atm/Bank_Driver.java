package org.jsp.bank_atm;

import java.util.Scanner;

public class Bank_Driver {

	public static void main(String[]args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter bank name ");
		String bname=s.next();
		System.out.println("Enter address of bank");		
		String loc=s.next();
		System.out.println("ifsc_code");
		String ifsc=s.next();
		Bank b =new Bank(bname,loc,ifsc,null);
		
		boolean option =true;
		while(option) 
		{
			System.out.println("Enter your choice");
			System.out.println("Enter 1. for create account");
			System.out.println("Enter 2. for check detalis");
			System.out.println("Enter 3. for deposite money");
			System.out.println("Enter 4. for withdraw money");
			System.out.println("Enter 5. for delete account");
			System.out.println("Enter 6. for exit ");
			
			int choice=s.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter name");
				String name=s.next();
				System.out.println("Enter dob");
				String dob=s.next();
				System.out.println("Enter pin");
				String pin=s.next();
				System.out.println("Enter money to Deposite");
				double money=s.nextDouble();
				System.out.println("Enter Account Number");
				long ano=s.nextLong();
				b.createAccount(new Account(name, dob, pin, money, ano));
				System.out.println("=================");
				
			}
			break;
			case 2:{
				b.bankDetails();
				System.out.println("=================");	
			}
			break;
			case 3:{
				System.out.println("Enter account number to deposite money");
				long ano1=s.nextLong();
				System.out.println("Enter how much money you want to deposite");
				double money1=s.nextDouble();
				b.Deposite(ano1, money1);
				System.out.println("=======================");
			}
			break;
			case 4:{
				System.out.println("Enter account number to withdraw money");
				long ano1=s.nextLong();
				System.out.println("Enter how much money you want to withdraw");
				double money1=s.nextDouble();
				b.withdraw(ano1, money1);
				System.out.println("=======================");
			}
			break;
			case 5:{
				b.DelectAccount();
				System.out.println("");
			}
			break;
			case 6:{
				System.out.println("Thank you for using "+bname);
			}
			break;
			default:{
				System.out.println("Enter your pin number");
			}
			break;
		}
	}

	}
}
