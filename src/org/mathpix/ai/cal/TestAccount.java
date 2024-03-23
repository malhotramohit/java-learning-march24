package org.mathpix.ai.cal;

import edu.gyansetu.javalearning.Account;
import edu.gyansetu.javalearning.Customer;

// TestAcco// 1) object creation

// JVM -> TestAccount.main()

public class TestAccount {

	public static void main(String[] args) {
		Account acc = new Account("6546546546-654654-6456456", "Savings");

		// acc.accountNum = "66546-46546-654654-645645";

		// acc.bankName = "HDFC";

		System.out.println(acc.getAccountNum());
		System.out.println(acc.getAccountType());

		// Utility utility = new Utility();

		String maskedData = Utility.maskData(acc.getAccountNum());

		// TestAccount.main(args);

		acc.setAccountType("Currents");

		System.out.println(acc.getAccountType());

//		acc.balance = 3434;
		
		Customer customer =  new Customer("cu-r4445454", "Mohit", acc);

		customer.getAccount().getAccountNum();
		
	}

}
