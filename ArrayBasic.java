package Arrays;

import java.util.Scanner;

public class ArrayBasic {
	public static void main(String[] args) {
		int[] arr= new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array elements are-\n");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
