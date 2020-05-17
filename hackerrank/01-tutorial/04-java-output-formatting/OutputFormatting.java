import java.util.Scanner;

public class OutputFormatting {
	public static void main(String[] args) {
		String inputStr = "hello 0 hackerrank 65 java 10";
		Scanner sc = new Scanner(inputStr);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s%03d%n", s1, x);
		}
	        System.out.println("================================");
	}
}
