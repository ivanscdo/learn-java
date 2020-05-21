import java.util.*;

public class StdinStdout {
	public static void main(String[] args) {
		String n = "42 100 125";
		Scanner scan = new Scanner(n);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
