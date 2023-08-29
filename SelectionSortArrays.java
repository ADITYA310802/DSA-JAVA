package Arrays;

import java.util.Arrays;

public class SelectionSortArrays {
	
	public static void main(String[] args) {
		int[] arr= {10,4,21,8,7,54,31,87,-9,0,-74};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int last=arr.length-i-1;
			
			int maxIndex= getMaxIndex(arr, 0, last);
			
			swapArrayElement(arr, maxIndex, last);
		}

	}

	static int getMaxIndex(int[] arr, int start, int end) {
		int max=start;
		
		for(int i=start;i<=end;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		return max;
	}
	
	static void swapArrayElement(int[] arr, int first, int second)
	{
		int temp= arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}
