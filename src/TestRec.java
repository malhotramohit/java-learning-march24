
public class TestRec {
	public static void main(String[] args) {

		// recur :
		// p {bi} -> sp {si} -> till smallest p solu

		// 5! = 5*4!
		// 4! = 4*3!
		// 3!= 3*2!
		// 2! = 2*1!
		// 1!= 1
		int f = fact(5);
		System.out.println("5! = " + f);

		System.out.println(4);
		System.out.println(4.5);
		System.out.println("4");

		// t = n * O(1)
		// s = n * 4 = O(n)

		int sum = getSum(4, 'a');
		System.out.println("sum is : " + sum);

		//

		long sum1 = getSum(4, 5, 6);
		System.out.println("sum is : " + sum1);

	}

	public static int getSum(int a, int b) {
		return a + b;
	}

	public static long getSum(int a, int b, int c) {
		return a + b + c;
	}

	public static int getSum(int a, char b) {
		return a + b;
	}

	public static int getSum(char a, int b) {
		return a + b;
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}

		return n * fact(n - 1);
	}

}
