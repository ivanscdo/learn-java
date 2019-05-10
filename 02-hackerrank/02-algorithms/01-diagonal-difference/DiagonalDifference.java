class DiagonalDifference {
	public static void main(String[] args) {
		int[][] arr = {
			{11,2,4},
			{4,5,6},
			{10,8,-12}
		};
		int rtlSum = 0;
		int ltrSum = 0;
		int absDiff = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==j) {
					rtlSum += arr[i][j];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j >= 0; j--) {
				if ( (i+j) == (arr.length-1) ) {
					ltrSum += arr[i][j];
				}
			}
		}

		absDiff = Math.abs(rtlSum - ltrSum);
		System.out.println(absDiff);
	}
}
