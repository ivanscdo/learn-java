import java.util.*;

class CountingValleys {
	public static void main(String[] args) {
		String s = "UDDDUDUU";
		char[] arr = s.toCharArray();
		int[] arrCounter = new int[arr.length];
		int counter = 0;
		int valleyCounter = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'D') {
				counter--;
				arrCounter[i] = counter;
			} else if (arr[i] == 'U') {
				counter++;
				arrCounter[i] = counter;
			}
		}

		for (int i = 0; i < arrCounter.length; i++) {
			if (arrCounter[i] == 0) {
				if (arrCounter[i-1] < 0) {
					valleyCounter++;
				}
			}
		}

		System.out.println(valleyCounter);
	}
}
