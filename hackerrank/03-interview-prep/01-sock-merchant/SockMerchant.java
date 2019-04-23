class SockMerchant {
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int[] arrCopy = new int[arr.length];
		int pairCount = 0;
		int pairTotal = 0;

		arrCopy = java.util.Arrays.copyOf(arr,arr.length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arrCopy[j]) {
					pairCount++;
					arrCopy[j] = 0;
				}
			}
			pairTotal += (int)(pairCount/2);
			pairCount = 0;
		}
		System.out.println(pairTotal);
	}
}
