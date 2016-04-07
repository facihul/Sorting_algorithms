package sorting;

/*
 *@author: MD. Facihul Azam 
 * This class contains Implementation of three sorting algorithms 
 * namely Bubble Sort, Insertion Sort and Merge Sort.
 * A recursive function is used to divide the array into smaller section for Merge Sort. 
 * */

import java.util.Arrays;

public class Sort{
	
	int temp; 
	
	public static void  Merge(int array[],int temparray[],int Lidx, int Midx, int Hidx){
		int LowIdx1 = Lidx;
		int LowIdx2 = Midx+1;
		int i = Lidx;
		System.arraycopy(array, 0, temparray, 0, array.length);  
		
		while(LowIdx1 <= Midx && LowIdx2 <= Hidx){
			if(temparray[LowIdx1] <= temparray[LowIdx2] ){
				 array[i] = temparray[LowIdx1];
				 LowIdx1++;
			}else {
			     array[i] = temparray[LowIdx2];
				 LowIdx2++;
			}
			i++;
		}
		
		while(LowIdx1<=Midx){
			 array[i] = temparray[LowIdx1];
			 LowIdx1++;
			 i++;
		}
		  
       while(LowIdx2<=Hidx){
    	     array[i] = temparray[LowIdx2];
    	     i++;
			 LowIdx2++;
		}
		  
	  }
	  
	public void BubbleSort(int array[]){
		  for (int Iteration=0; Iteration < array.length-1; Iteration++ ){
			  for(int j = 0; j< array.length -1-Iteration; j++){
				  if(array[j]>array[j+1]){
					  temp= array[j];
					  array[j]= array[j+1];
					  array[j+1]=temp;
				  }
				  
			  }
			 
		  }
		System.out.println("Bubble Sort :" + Arrays.toString(array)); 
		  
	 }

  public void MergeSort(int array[],int temparray[],int Lidx, int Hidx){
	  if(Hidx>Lidx){
		int Midx = ( Lidx + Hidx ) / 2;
		MergeSort(array,temparray,Lidx,Midx);
		MergeSort(array,temparray,Midx+1, Hidx);
		Merge(array,temparray,Lidx,Midx,Hidx);
	  }
	  
		
   }
  
  
	public void InsertionSort(int array[]){
		int j;
		for (int Iteration=1; Iteration < array.length; Iteration++ ){
			temp = array[Iteration];
			  for(j = Iteration; j > 0 && array[j] < array[j-1]; j-- ){
					  array[j]= array[j-1];
			   }
			array[j] = temp;	  
			  
		 }
			 
		System.out.println("Insertion Sort :" + Arrays.toString(array));
	}
  
}
