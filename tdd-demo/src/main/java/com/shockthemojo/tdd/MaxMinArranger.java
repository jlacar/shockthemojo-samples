package com.shockthemojo.tdd;

public class MaxMinArranger {

	public int[] arrange(int... nums) {
		if (nums.length == 0) {
			return new int[] {};
		}
		
		return rearrange(nums);
	}

	private int[] rearrange(int[] nums) {
		for (int startFrom = 0; startFrom < nums.length - 1; startFrom++) {
			arrangeRest(nums, startFrom);
		}
		return nums;
	}

	private void arrangeRest(int[] nums, int first) {
		for (int other = first + 1; other < nums.length; other++) {
			if (shouldSwap(nums, first, other)) {
				swap(nums, first, other);
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private boolean shouldSwap(int[] nums, int first, int other) {
		return otherIsLargerThan(first) ? nums[first] < nums[other] : nums[first] > nums[other];
	}

	private boolean otherIsLargerThan(int first) {
		return first % 2 == 0;
	}

}
