package org.jsp.bank_atm;

public class Bank {
	String bname;
	String loc;
	String ifsc_code;
	Account a;

	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public Account getA() {
		return a;
	}
	public void setA(Account a) {
		this.a = a;
	}
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(String name, String loc, String ifsc_code, Account a ) {
		super();
		this.bname = name;
		this.loc = loc;
		this.ifsc_code = ifsc_code;
		this.a=a;
	}
	public void bankDetails() {
		System.out.println("bname :"+bname);
		System.out.println("loc :"+loc);
		System.out.println("ifsc_code :"+ifsc_code);

		
	
		if (a!= null) {
			System.out.println("name :" +a.account_holder_name);
			System.out.println("dob :" + a.dob);
			System.out.println("pin :" + a.pin);
			System.out.println("money :" + a.money);

		} else {
			System.out.println("Open your Account First");
		}
	}

	public void createAccount(Account a) {
		if (this.a == null) {
			this.a = a;
			System.out.println("Account Successfull Created");
		} else {
			System.out.println("Already Account is Existing");
		}
	}

	public void Deposite(long ano,double money) {
		if(a.ano==ano) {
			if(money!=0) {
				a.money=a.money+money;
				System.out.println("deposite amount is "+money);
				System.out.println("total balance is " +a.money);
		}else{
			System.out.println("enter a valid amount to add in account ");}
		}
		else {
			System.out.println("enter valid account number ");
		}
		
	}


	public void withdraw(long ano, double money) {
		if(a.ano==ano) {
			if(a.money>=money) {
				a.money=a.money-money;
				System.out.println("withdraw amount is "+money);
				System.out.println("total balance is"+a.money);
			}else {
				System.out.println("Insufficiant balance");}
		} 
		else {
			System.out.println("enter a valid to add in account");
			}
		}
	public void DelectAccount() {
		this.a=null;
		System.out.println("account deleted");
	}
}
