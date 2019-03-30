class BinarySearchArray {
	public static void main(String[] args) {
		String[] binSearch = {"red", "wine", "success"};
		String binSearchKey = "success";
		java.util.Arrays.sort(binSearch);

		int binSearchReturn = java.util.Arrays.binarySearch(binSearch, binSearchKey);
		System.out.println(binSearchReturn);
	}
}