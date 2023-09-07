package org.jsp.bank_atm;

public class Account {

	public String account_holder_name;
	public String dob;
	public String pin;
	public double money;
	public long ano;


	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(String account_holder_name, String dob, String pin, double money, long ano) {
		super();
		this.account_holder_name = account_holder_name;
		this.dob = dob;
		this.pin = pin;
		this.money = money;
		this.ano = ano;
	}

	
	public String getAccount_holder_name() {
		return account_holder_name;
	}


	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public long getAno() {
		return ano;
	}


	public void setAno(long ano) {
		this.ano = ano;
	}


	@Override
	public String toString() {
		return "Account [account_holder_name=" + account_holder_name + ", dob=" + dob + ", pin=" + pin + ", money="
				+ money + ", ano=" + ano + "]";
	}


	public void accountDetalis() {
		System.out.println(account_holder_name);
		System.out.println(dob);
		System.out.println(pin);
		System.out.println(money);
		System.out.println(ano);
	}
}
