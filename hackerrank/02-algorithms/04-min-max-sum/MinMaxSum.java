class MinMaxSum {
	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};

		java.util.Arrays.sort(arr);

		long arrMinSum = 0L;
		long arrMaxSum = 0L;

		for (int i = 0; i < arr.length-1; i++) {
			arrMinSum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			if (i !=0 ) {
				arrMaxSum += arr[i];
			}
		}

		System.out.println(arrMinSum + " " + arrMaxSum);
	}
}
