package basic_programs;

public class FirstAndSecondMin_wtht_BBSort {
	public static void main(String[] args) {

		int[] a = {0, 3, 4, 0};

		// Initialize the first and second minimums to the maximum value
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int num : a) {
			if (num < min1) {
				// Update both min1 and min2
				min2 = min1;
				min1 = num;
			} else if (num < min2 && num != min1) {
				// Update only min2 if it's not equal to min1
				min2 = num;
			}
		}

		System.out.println("First Minimum: " + min1);
		System.out.println("Second Minimum: " + min2);
	}
}
