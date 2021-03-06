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

	private AdjacentMultiplesProblem testSubject = new AdjacentMultiplesProblem();
	
	@Test(expected=IllegalArgumentException.class)
	public void should_reject_null_with_IllegalArgumentException() throws Exception {
		testSubject.check(null);
	}
	
	@Test
	public void should_return_false_for_empty_array() throws Exception {
		assertFalse(testSubject.check(new int[] {}));
	}
	
	@Test
	public void should_return_false_for_array_with_one_element() throws Exception {
		assertFalse(testSubject.check(new int[] {1}));
	}
	
	@Test
	public void should_return_false_when_no_adjacent_multiple() throws Exception {
		assertFalse(testSubject.check(new int[] {1, 4}));
	}
	
	@Test
	public void should_return_true_when_adjacent_multiples_exist() throws Exception {
		assertTrue(testSubject.check(new int[] {1, 40, 400}));	
		assertTrue(testSubject.check(new int[] {40, 400, 1}));	
		assertTrue(testSubject.check(new int[] {1, 3, 30, 50}));
	}
	
	@Test
	public void should_return_false_when_multiples_are_not_adjacent() throws Exception {
		assertFalse(testSubject.check(new int[] {40, 1, 400, 10}));	
	}
}
