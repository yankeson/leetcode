package com.ksyang.math;

import org.springframework.stereotype.Service;

@Service
public class MathUtil {
	
	/**
	 * initial value of exponent must be 1
	 * @param m
	 * @param n
	 * @param exponent
	 * @return
	 */
	public int findGcd(int m, int n, int exponent) {
		
		if(m==n) return m*exponent;
		
		while(isEven(m) && isEven(n)) {
			m = m/2;
			n = n/2;
			
			exponent = exponent*2;
		}
		
		if(m<n) return findGcd(n, m, exponent);
		
		return findGcd(m-n, n, exponent);
	}
	
	public boolean isEven(int m) {
		
		int t = m&1;
		
		if(t==0) return true;
		
		return false;
	}

}
