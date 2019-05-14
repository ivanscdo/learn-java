import java.util.*;

class IsArraySorted {
	public static void main(String[] args) {
		// test cases:
		
		// Integer[] unsorted = {-1, 0, 1};
		// Integer[] unsorted = {-1, 3, 10, 10};
		// Integer[] unsorted = {1, 1, 1};
		// Integer[] unsorted = {0, -1};
		// Integer[] unsorted = {0};
		Integer[] unsorted = {-1, -3};
		// Integer[] unsorted = {};
		// Integer[] unsorted = {-1, 0, 1, 10, 9};

		Integer[] sorted = Arrays.copyOf(unsorted, unsorted.length);
		Arrays.sort(sorted);

		List<Integer> mrMime = Arrays.asList(unsorted);
		List<Integer> mrMimeSorted = Arrays.asList(sorted);

		System.out.println(mrMime.equals(mrMimeSorted));
	}
}
