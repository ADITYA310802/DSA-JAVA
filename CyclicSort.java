package Arrays;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		int[] arr= {3,5,2,1,4};
		
		cyclicSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	public static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length)
		{
			int correctIndex=arr[i]-1;
			
			if(arr[i]!=arr[correctIndex])
			{
				swap(arr,i,correctIndex);
			}
			else
			{
				i++;
			}
		}
	}

	public static void swap(int[] arr, int a, int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;	
	}
}
