package com.ksyang.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayRotaterTest {
	
	@Test
	public void testShiftInHalf() {
		
		int[] intArr = {1, 2, 3, 4, 5, 6, 7};
		int[] arr = {5, 6, 7, 1, 2, 3, 4};
		
		ArrayRotater rotator = new ArrayRotater();
		assertArrayEquals(arr, rotator.shiftInHalf(intArr));
	}

}
