package com.shockthemojo.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdjacentMultiplesProblemTest {

	/*
	 * Given: int[] numbers
	 * 
	 * Required: A way to check whether or not the array contains at least one
	 * pair of adjacent elements such that nums[i] * 10 == nums[i+1]
	 * 
	 * Your solution may be iterative or recursive but it must be able to handle
	 * different lengths of arrays and it should reject a null reference as
	 * invalid input.
	 */

	@Test(expected=IllegalArgumentException.class)
	public void should_reject_null_with_IllegalArgumentException() throws Exception {
		AdjacentMultiplesProblem testSubject = new AdjacentMultiplesProblem();
		testSubject.check(null);
	}
}
