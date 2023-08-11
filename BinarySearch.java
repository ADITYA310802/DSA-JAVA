package Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= {-5,6,7,10,13,21,34,45,65,68,77,86,89,92,101};
		int target=77;
		int indexFound= binarySearch(arr,target);
		
		if(indexFound==-1)
		{
			System.out.println("Target Not Found");
		}
		else
		{
			System.out.println("Target found at index: "+ indexFound);
		}
		
	}

	static int binarySearch(int[] arr, int target) 
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
		}
		
		return -1;
	}

}
