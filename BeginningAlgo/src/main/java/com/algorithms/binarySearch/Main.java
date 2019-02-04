package com.algorithms.binarySearch;

public class Main {

	public static void main(String[] args) {
		int[] intArray = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		BinarySearch binarySearch = new BinarySearch();
		int a = binarySearch.binarySearch(intArray, 0, 9, 5);
		System.out.println(a);
	}

}
