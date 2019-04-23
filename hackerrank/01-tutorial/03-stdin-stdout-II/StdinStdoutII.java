import java.util.Scanner;

public class StdinStdoutII{
	public static void main(String[] args) {
		String str = "42 3.1415 Welcome to HackerRank's Java Tutorials!";

		Scanner scan = new Scanner(str);
		int i = scan.nextInt();
		double d = scan.nextDouble();
//		String space = scan.nextLine();
		String s = scan.next();
		scan.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}
