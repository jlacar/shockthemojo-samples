package com.shockthemojo.tdd;

public class AdjacentMultiplesProblem {

	public boolean check(int[] numbers) {
		if (numbers == null) {
			throw new IllegalArgumentException("Argument cannot be null.");
		}
		
		if (numbers.length < 2) {
			return false;
		}
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] == numbers[i-1] * 10)
				return true;
		}
		
		return false;
	}

}
