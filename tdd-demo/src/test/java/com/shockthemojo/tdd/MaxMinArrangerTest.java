package com.shockthemojo.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxMinArrangerTest {

	@Test
	public void test() {
		MaxMinArranger testSubject = new MaxMinArranger();
		int[] result = testSubject.arrange(1, 7);
		
		assertArrayEquals(new int[] {7, 1}, result);
	}
	
	@Test
	public void empty_array() throws Exception {
		MaxMinArranger testSubject = new MaxMinArranger();
		int[] result = testSubject.arrange();
		
		assertArrayEquals(new int[] {}, result);
	}
	


}
