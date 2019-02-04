package com.algorithms.insertionSort;

public class InsertionSort {

	public int[] array = new int[] { 10, 23, 7, 8, 12, 3, 1, 66 };
	
	public void sort() {
		for(int i = 0; i < array.length; i++) {
			int j = i;
			int aux;
			while(j > 0 && (array[j] < array[j - 1]) ) {
				aux = array[j - 1];
				array[j - 1] = array[j];
				array[j] = aux;
				j--;
			}
		}
		
		display();
	}
	
	private void display() {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}
	
}
