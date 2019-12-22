

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ParthAcademy
{
    public  void search(int[] arr,int ele){
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==ele){
                System.out.printf("\nElement found at %d ",i);
                return ;
            }
            
        }
        System.out.printf("Element not found.");
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Hello World!");
		int [] arr= new int[]{1,3,4,5,6};
		ParthAcademy pa = new ParthAcademy();
		
		pa.search(arr,53);
	}
}
