package com.shockthemojo.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxMinArrangerTest {
	
	@Test
	public void empty_array_returns_empty_result() throws Exception {
		MaxMinArranger testSubject = new MaxMinArranger();
		int[] result = testSubject.arrange();
		
		assertArrayEquals(new int[] {}, result);
	}
	
	@Test
	public void two_element_array_comes_back_with_max_min() {
		MaxMinArranger testSubject = new MaxMinArranger();
		int[] result = testSubject.arrange(1, 7);
		
		assertArrayEquals(new int[] {7, 1}, result);
	}

	@Test
	public void multiple_elements_arranged_as_max_min_pairs() throws Exception {
		MaxMinArranger testSubject = new MaxMinArranger();
		int[] result = testSubject.arrange(6, 2, 1, 7);
		
		assertArrayEquals(new int[] {7, 1, 6, 2}, result);
	}
	
	@Test
	public void tried_with_sample_data_given_in_problem() throws Exception {
		MaxMinArranger testSubject = new MaxMinArranger();
		int[] result = testSubject.arrange(6, 4, 1, 7, 3, 2, 5);
		
		assertArrayEquals(new int[] {7, 1, 6, 2, 5, 3, 4}, result);
	}
}
