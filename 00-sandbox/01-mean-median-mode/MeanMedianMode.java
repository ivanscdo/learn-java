import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

class MeanMedianMode {
	public static void main(String[] args) {
		int[] nums = {13, 18, 13, 14, 13, 16, 14, 21, 13};
		// int[] nums = {1, 2, 4, 7};
		// int[] nums = {8, 9, 10, 10, 10, 11, 11, 11, 12, 13};

		int mean = 0;
		float meanFloat = 0.0f;
		int sum = 0;

		int median = 0;
		float medianFloat = 0.0f;
		int mid = 0;
		
		ArrayList<Integer> modes = new ArrayList<Integer>();
		int count = 1;
		int tempTopScore = 0;
		int topScore = 2;

		Arrays.sort(nums);

		// mean
		for (int num : nums ) {
			sum += num;
		}
		if ( sum % nums.length != 0 ) {
			meanFloat = (float)sum / nums.length;
			System.out.println("Mean: " + meanFloat);
		} else if ( sum % nums.length == 0 ) {
			mean = sum / nums.length;
			System.out.println("Mean: " + mean);
		}

		// median
		if (nums.length % 2 != 0) {
			median = (nums.length + 1) / 2;
			System.out.println("Median: " + nums[median]);
		} else if (nums.length % 2 == 0) {
			mid = nums.length / 2;
			if ( (nums[mid] + nums[mid-1]) % 2 != 0 ) {
				medianFloat = (float)(nums[mid] + nums[mid-1])/2;
				System.out.println("Median: " + medianFloat);
			} else if ( (nums[mid] + nums[mid-1]) % 2 == 0 ) {
				median = (nums[mid] + nums[mid-1])/2;
				System.out.println("Median: " + median);
			}
		}

		// mode
		for (int i = 0; i < nums.length; i++) {
			if ( i != (nums.length-1) ) {
				if ( nums[i] == nums[i+1] ) {
					count++;
				} else if ( nums[i] != nums[i+1] ) {
					tempTopScore = count;
					if ( tempTopScore >= topScore ) {
						topScore = tempTopScore;
						modes.add(nums[i]);
					}
					count = 1;
				}
			} else if ( i == (nums.length-1) ) {
				if (modes.isEmpty()) {
					System.out.println("Mode: none");
				} else {
					System.out.println("Mode: " + modes.stream()
						.map(Object::toString)
						.collect(Collectors.joining(", ")));
				}
			} 
		}
	}
}
