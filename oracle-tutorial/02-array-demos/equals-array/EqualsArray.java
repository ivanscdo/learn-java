class EqualsArray {
	public static void main(String[] args){
		String[] array = {"red", "wine", "success"};
		String[] twinArray = {"red", "wine", "success"};
		String[] difArray = {"red", "wine"};
			
		boolean isArrayEqual = java.util.Arrays.equals(array, difArray);

		System.out.println(isArrayEqual);
	}
}