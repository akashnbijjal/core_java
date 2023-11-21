package Arrays01;

import java.util.Arrays;
import java.util.Scanner;

public class Sample2 {

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { nums[i], nums[j] };
				}
			}

		}
		return new int[] {};
	}

	public static void main(String[] args) {
		Sample2 s = new Sample2();
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
	int result[]=s.twoSum(nums, target);
	System.out.println(Arrays.toString(result));
	}

}