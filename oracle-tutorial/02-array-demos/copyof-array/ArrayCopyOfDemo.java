class ArrayCopyOfDemo {
	public static void main(String[] args) {
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 
				    'i', 'n', 'a', 't', 'e', 'd' };
		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2,
							      copyFrom.length);

		System.out.println(new String(copyTo));
		System.out.println(copyFrom.length);
	}
}