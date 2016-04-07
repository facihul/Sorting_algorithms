package sorting;
/*
 *@author: MD. Facihul Azam 
 * Example of some basic sorting algorithm with Object oriented way.
 * This is main class inherits the Sort class for array of integers sorting.
 * 
 * */


import java.util.Arrays;

class MainSort extends Sort{
	

	public static void main(String[] args) {
		
		int array[] = new int[]{1,32,12,78,2345,1,9,2,72,4,6,7, 2}; 
		int temparray[] = new int[array.length];
		System.out.println("The array :" + Arrays.toString(array));
		
         MainSort Sorting = new MainSort();
         Sorting.BubbleSort(array);
         Sorting.InsertionSort(array);
         Sorting.MergeSort(array,temparray,0,array.length-1);
         System.out.println("Merge Sort :" + Arrays.toString(array)); 
	}

}
