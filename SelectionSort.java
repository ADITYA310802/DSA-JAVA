package Arrays;

import java.util.Scanner;

public class SelectionSort {
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
			int largest=0;
			for(int i=0;i<=lastUnsortedIndex;i++)
			{
				if(arr[i]>arr[largest])
				{
					largest=i;
				}
			}
			swap(arr,largest,lastUnsortedIndex);
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
