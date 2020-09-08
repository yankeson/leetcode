package com.ksyang.array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ksyang.math.MathUtil;

public class MathUtilTest {
	private static MathUtil mathUtil;
	
	@BeforeClass
	public static void init() {
		mathUtil = new MathUtil();
	}
	
	@Test
	public void testIsEven() {
		
		assertTrue(mathUtil.isEven(18));
		assertFalse(mathUtil.isEven(23));
	}
	
	@Test
	public void testFindGcd() {
		
		assertEquals(1, mathUtil.findGcd(2, 3, 1));
		assertEquals(6, mathUtil.findGcd(18, 12, 1));
		assertEquals(8, mathUtil.findGcd(24, 16, 1));
		assertEquals(3, mathUtil.findGcd(9, 6, 1));
	
		
	}
}
