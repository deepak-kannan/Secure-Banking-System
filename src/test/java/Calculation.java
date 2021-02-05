package com.group9.bankofaz.test;

public class Calculation {  
  
    public static int findMax(int arr[]){  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }
        
// code to test the code quality
        for (int i=1;i<4;i++)
        {
        	System.out.println("Code Quality Test");  
        	System.out.println("Code Quality Test2");
        }
        
        return max;  
            }  
}  
