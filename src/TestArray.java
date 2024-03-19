
public class TestArray {
	public static void main(String[] args) {

		// random access
		int[] marks = new int[5];
		// 0 1 2 3 4
		marks[0] = 23;
		marks[1] = 45;
		marks[2] = 12;
		marks[3] = 34;
		marks[4] = 25;

		// sort and second - nlogn
		int max = marks[0];
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// sort
		// {0 ,1 , 1 , 0 , 1 , 1 ,0}
		// n time

		// {34,-2,3,6,-1,9,45,32 , 7} , sum = 5 , {(-2,7),(6,-1)}

		max = getMax(marks);

		System.out.println("Max is " + max);

	}

	public static int getMax(int[] marks) {

		int max = marks[0];

		for (int i = 1; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		}

		return max;

	}

}
