package Arrays;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array elements in unsorted order are-\n");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
		{
			for(int i=0;i<lastUnsortedIndex;i++)
			{
				if(arr[i]>arr[i+1])
				{
					swap(arr,i,i+1);
				}
			}
		}
		System.out.println("The array elements in sorted order are-\n");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
	 public static void swap(int[] arr, int i, int j)
	 {
		 if(i==j)
		 {
			 return;
		 }
		 
		 int temp=arr[j];
		 arr[j]=arr[i];
		 arr[i]=temp;
	 }
}
