package Arrays;

import java.util.Arrays;

public class ArrayQues1 {
	public static void main(String[] args) {
		int[] arr= {11,7,5,10,46,23,16,18};
		int num=3;
		ArrayChange(arr,num);

}

	public static void ArrayChange(int[] arr, int num) {
		// TODO Auto-generated method stub
		int len=arr.length;
		int[] arr2= new int[len];
		int temp = 0;  
        for(int i=0; i < num-1; i++){  
                for(int j=1; j < (num-i); j++){  
                         if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                temp = arr[j-1];  
                                arr[j-1] = arr[j];  
                                arr[j] = temp;  
                        }  
                          
                }
        }
         for(int i=0;i<num;i++)
         {
        	 arr2[i]=arr[i];
         }
         int temp2 = 0;  
         for(int i=num+1; i < len; i++){  
                 for(int j=1; j < (len-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                  //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                           
                 }
         }
         System.out.println(Arrays.toString(arr));
         int j = len;
         for (int i = num; i < len; i++) {
             arr2[j - 1] = arr[i];
             j = j - 1;
         }
         
         System.out.println(Arrays.toString(arr2));
         
	} 	
	}
