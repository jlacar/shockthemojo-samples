package com.shockthemojo.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxMinArrangerTest {

	@Test
	public void test() {
		MaxMinArranger testSubject = new MaxMinArranger();
		int[] result = testSubject.arrange(1, 7);
	}

}
