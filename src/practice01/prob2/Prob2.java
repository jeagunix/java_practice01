package practice01.prob2;

public class Prob2 {
	public static void main(String args[]) {
		int[] numArray = new int[10];

		for (int i = 0; i < numArray.length - 1; i++) {
			for (int j = 0; j < numArray.length; j++) {
				numArray[j] = i + j + 1;
				System.out.print(numArray[j] + " ");
			}
			System.out.println();

		}

	}
}
