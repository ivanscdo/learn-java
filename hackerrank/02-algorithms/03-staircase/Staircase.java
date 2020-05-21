class Staircase {
	public static void main(String[] args) {

		int n = 6;
		String[] spacePound = new String[n];
		
		for (int i = 0; i < n; i++) {
			spacePound[i] = " ";
		}

		for (int i = n-1; i >= 0; i--) {
			spacePound[i] = "#";

			String spacePoundJnd = String.join("", spacePound);
			System.out.println(spacePoundJnd);
		}	
	}
}
