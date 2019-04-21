class BirthdayCakeCandles {
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 3};

		java.util.Arrays.sort(arr);
		int maxNum = arr[arr.length-1];
		int maxNumCounter = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maxNum) {
				maxNumCounter ++;
			}
		}

		System.out.println(maxNumCounter);
	}
}
