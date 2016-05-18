package com.shockthemojo.tdd;

public class MaxMinArranger {

	public int[] arrange(int... nums) {
		if (nums.length == 0) {
			return new int[] {};
		}
		
		return rearrange(nums);
	}

	private int[] rearrange(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				boolean swap = (i % 2 == 0) ? nums[i] < nums[j] : nums[i] > nums[j];
				if (swap) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

}
