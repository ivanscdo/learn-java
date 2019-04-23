/*
* if n is odd, print Weird
* if n is even and:
*	in the inclusive range 2 & 5, print Not Weird
*	in the inclusive range 6 & 20, print Weird
*	greater than 20, print Not Weird	
*/

public class IfElse {
	public static void main(String[] args) {
		int n = 20;

		if (n % 2 != 0) {
			System.out.println("Weird");
		} else if (n % 2 == 0) {
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			} else if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else if (n > 20) {
				System.out.println("Not Weird");
			}
		}
	}
}
