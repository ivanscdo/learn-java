class StringLength {
	public static void main(String[] args) {
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
		System.out.println(searchMe);
		System.out.println(searchMe.length());

		for(int i = 0; i < searchMe.length(); i++) {
			System.out.println(searchMe.charAt(i) + " - " + i);
		}
	}
}
