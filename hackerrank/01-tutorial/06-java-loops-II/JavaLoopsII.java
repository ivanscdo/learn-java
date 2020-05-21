class JavaLoopsII {
	public static void main(String[] args) {
		// a + 2^0 + b
		// a + 2^0 + b + 2^1 * b
		// a + 2^0 + b + 2^1 * b + ... + 2^n-1 * b

		int a = 0;
		// int a = 5;
		int b = 2;
		// int b = 3;
		int n = 10;
		// int n = 5;
		double ansDouble = a + Math.pow(2,0) * b;
		int ans = (int)ansDouble;

		for (int i = 1; i <= n; i++) {
			System.out.print(ans + " ");
			ansDouble += Math.pow(2,i) * b;
			ans = (int)ansDouble;
		}
		System.out.println();
	}
}
