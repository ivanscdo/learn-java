class PrePostDemo {
	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i); // 4
		i++;
		System.out.println(i); // 5
		System.out.println(++i); // 6 prefix operator evaluates to new value
		System.out.println(i++); // 6 postfix operator evals to original value
		System.out.println(i); // 7
	}
}