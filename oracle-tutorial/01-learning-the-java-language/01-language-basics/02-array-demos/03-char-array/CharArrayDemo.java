class CharArrayDemo {
	public static void main(String[] args) {
		String secret = "wine";

/* 		// long syntax
*		String[] charArray;
*		charArray = new String[3];
*		charArray[0] = "red";
*		charArray[1] = "wine";
*		charArray[2] = "success";
*/

		// short syntax		
		String[] charArray = {
		"red", "wine", "success"
		};

		for(int i=0; i < charArray.length; i++) {
			if (charArray[i] == secret) {
				System.out.println(charArray[i]);
			}
		}
	}
}