class PlusMinus {
	public static void main(String[] args) {
		int[] arr = {-4, 3, -9, 0, 4, 1};
		float positiveNums = 0.0f;
		float negativeNums = 0.0f;
		float zeroNums = 0.0f;
		float denominator = arr.length;
		float positiveDecimal = 0.0f;
		float negativeDecimal = 0.0f;
		float zeroDecimal = 0.0f;

		for (int num : arr) {
			if (num > 0) {
				positiveNums += 1.0;
			} else if (num == 0) {
				zeroNums += 1.0;
			} else if (num < 0) {
				negativeNums += 1.0;
			}
		}

		positiveDecimal = positiveNums/denominator;
		negativeDecimal = negativeNums/denominator;
		zeroDecimal = zeroNums/denominator;

		System.out.println(positiveDecimal);
		System.out.println(negativeDecimal);
		System.out.println(zeroDecimal);
	}
}
