package Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {-5,6,7,10,13,21,34,45,65,68,77,86,89,92,101};
		int target=34;
		int indexFound= linearSearch(arr,target);
		
		if(indexFound==-1)
		{
			System.out.println("Target Not Found");
		}
		else
		{
			System.out.println("Target found at index: "+ indexFound);
		}
	}
	 static int linearSearch(int[] arr, int target) {
		 
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				return i;
			}
		}
		
		return -1;
	}
}
