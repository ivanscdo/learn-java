class FillArray {
	public static void main(String[] args) {
		char[] emptyArray = {' ', ' '};
		char fillArray = 'r';

		java.util.Arrays.fill(emptyArray, fillArray);
		
		System.out.println(emptyArray);
	}
}