public class JavaLoopsI {
	public static void main(String[] args) {
		int n = 2;
		int nProduct = 0;

		for (int i = 1; i <= 10; i++) {
			nProduct = n * i;
			System.out.printf("%d x %d = %d%n", n, i, nProduct);
		}
	}
}
