package edu.gyansetu.javalearning;

public class Customer {

	private String custId;
	private String custName;
	// has a relationship;

	private Account account;

	public Customer(String custId, String custName, Account account) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.account = account;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
