class MultiDimArrayDemo {
	public static void main(String[] args) {
		String[][] names = {
			{"Mr. ", "Mrs. ", "Ms. "}, 
			{"Smith", "Jones"}
		};
		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);
		// print array's size to standard output
		System.out.println(names.length);
	}
}