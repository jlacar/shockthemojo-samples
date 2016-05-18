package com.shockthemojo.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxMinArrangerTest {

	private MaxMinArranger testSubject = new MaxMinArranger();

	@Test
	public void empty_array_returns_empty_result() throws Exception {
		assertArrayEquals(new int[] {}, testSubject.arrange());
	}

	@Test
	public void two_element_array_comes_back_with_max_min() {
		assertArrayEquals(new int[] { 7, 1 }, testSubject.arrange(1, 7));
	}

	@Test
	public void multiple_elements_arranged_as_max_min_pairs() throws Exception {
		assertArrayEquals(new int[] { 7, 1, 6, 2 }, testSubject.arrange(6, 2, 1, 7));
	}

	@Test
	public void tried_with_sample_data_given_in_problem() throws Exception {
		assertArrayEquals(new int[] { 7, 1, 6, 2, 5, 3, 4 }, testSubject.arrange(6, 4, 1, 7, 3, 2, 5));
	}
}
