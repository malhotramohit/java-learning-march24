package edu.gyansetu.javalearning;

public class Account {

	private String accountNum;
	private String accountType;

	static String BANK_NAME;

	private int balance;

	public Account(String accountNum, String accountType) {
		this.accountNum = accountNum;
		this.accountType = accountType;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	// POJO : private fields , public getter setter
//
//	public String getAccountNum() {
//		return this.accountNum;
//	}
//
//	public String getAccountType() {
//		return this.accountType;
//	}
//
//	public void setAccountType(String accountType) {
//		if (accountType.equals("Savings") || accountType.equals("Current")) {
//			this.accountType = accountType;
//		} else {
//			System.out.println("Wrong accountType");
//		}
//
//	}

//	Account(int accountNumP) {
//		accountNum = accountNumP;
//	}

//	Account(String accountNum, String accountType) {
//
//		this.accountNum = accountNum;
//
//		this.accountType = accountType;
//	}
//	Account(){
//		
//	}

}
