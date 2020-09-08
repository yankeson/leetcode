package com.ksyang.array;

import org.springframework.stereotype.Service;

@Service
public class ArrayRotater <K> {
	
   public int[] shiftInHalf(int[] intArr) {
	
	   int len = intArr.length;
	   int half = len/2;
	   
	   if(len%2==0) {
		   for(int i=0; i<half; i++) {
			   int tmp = intArr[i];
			   intArr[i] = intArr[i+half];
			   intArr[i+half]= tmp;
		   }
	   }else {
		   int tmp = intArr[half];
		   
		   for(int i=0; i<half; i++) {
			   intArr[i+half] = intArr[i];
			   intArr[i] = intArr[i+half+1];
		   }
		   
		   intArr[len-1] = tmp;
	   }

	   return intArr;   
   }
   
   public void copy(K[] initArr, int step) {
	   if(step==0 || initArr==null || initArr.length==0) return;
	   
	   if(initArr.length<step) step = step%initArr.length;
	   
	   @SuppressWarnings("unchecked")
	   K[] tmp = (K[]) new Object[initArr.length];
	   
	   for(int i=0; i<initArr.length; i++) {
		   
		   int j = i+step;
		   
		   if(j>=initArr.length) j = j-initArr.length;
		   tmp[j] = initArr[i];
	   }
	   
	   System.arraycopy(tmp, 0, initArr, 0, initArr.length);
   }
   
   public void bubbleShift(K[] initArr, int step) {
	   
	   if(step==0 || initArr==null || initArr.length==0) return;
	   if(initArr.length<step) step = step%initArr.length;
	   
	   int s=0;
	   int maxIdx = initArr.length-1;

	   while(s<step) {
		   K tmp = initArr[maxIdx];
		   
		   for(int i=maxIdx; i>=1; i--) {
			  initArr[i] = initArr[i-1];
		   }
		   initArr[0] = tmp;
		   
		   s++;
	   }
   }
   
	public void enhancedBubbleShift(K[] initArr, int step) {
		
		   if(step==0 || initArr==null || initArr.length==0) return;
		   
		   if(initArr.length<step) step = step%initArr.length;
		   
		   
	}

}
