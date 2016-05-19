package com.shockthemojo.tdd;

public class AdjacentMultiplesProblem {

	public boolean check(int[] numbers) {
		if (numbers == null) {
			throw new IllegalArgumentException("Argument cannot be null.");
		}
		
		if (numbers.length < 2) {
			return false;
		}
		
		return true;
	}

}
