package com.algorithms.binarySearch;

import java.util.Arrays;

public class BinarySearch {

	public int binarySearch(int []array, int start, int end, int findNo) {
		int middleIndex = end - start - 1;
		int noOfMiddle = array[middleIndex];
		
		if(start <= end) 
		{
			if(array[middleIndex] == findNo) {
				return middleIndex + 1;
			}
		
			if(noOfMiddle < findNo) {
				return binarySearch(array, middleIndex, end, findNo);
			} else {
				return binarySearch(array, start, middleIndex, findNo);
			}
		}
		
		return -1;
	}
}
