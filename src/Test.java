
public class Test {

	public static void main(String[] args) {

		System.out.println("Hello,world");

		// 8 primitive data types

		// 2 00 01 10 11 : 4
		// 3 2^3 8
		byte age = 23; // 8 bits , 00000000 11111111

		// , 2^8 ,, -128 <-> 127 --> 256

		short dailyWages = 23445; // 16 2^15 - 2^15-1

		int salary = 6565656;

		long phoneNum = 9716671588L;

		int x = 129;
		byte y = (byte) x;
		System.out.println("Value of y " + y);

		int z = 012; // hw ? //

		System.out.println("Value of z " + z);

		float yearsOfEx = 3.4f;

		double distBwEarthAndMoon = 554546646646.456546546546456;

		char male = 'M' - 2; // 'M' -> ascii 110 -2 108
		char female = 'F';

		System.out.println("Try : " + male);

		boolean isPrime = true;

		//
		int m = 4;
		int n = 5;

		// w/o using
		n = m + n;
		m = (m + n) - m;
		n = m - n;
		System.out.println(m);
		System.out.println(n);

//		*****
//		*****
//		*****
//		*****
//		*****

		int i = 8;// entry check
		while (i < 5) {
			System.out.println("*****");
			i++;
		}

		// exit check ? min iteration
		// menu driven
		// menu -> 1

		int showMenu = 8;
		do {
			System.out.println("menu");
			i++;
		} while (i < 5);

		if (x < 2) {
			System.out.println("num less than 2");
		} else if (x > 3) {

		} else {

		}

		int num = 17;

		// prime num : 2 , 3 , 6
		for (int g = 2; g < num / 2; g++) {
			if (num % g == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Num is prime");
		} else {
			System.out.println("Num is not prime");
		}
		
		int s = 0x1f;
		
		

	}

}
