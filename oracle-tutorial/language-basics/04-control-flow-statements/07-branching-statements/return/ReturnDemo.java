class ReturnDemo {
	public static void main(String[] args) {
		int count = 10;
		for(int i = 1; i <= count; i++) {
			System.out.println(i);
			return;
		}
	}
}
