// Write a java program to find out the 2nd max number from given array using function.

package com.assignment2;

public class SecondMax 
{
 
	 public static int findSecondMax(int[] arr) 
	 {
	        if (arr.length < 2) 
	        {
	            throw new IllegalArgumentException("Array should contain at least two elements.");
	        }

	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;

	        for (int num : arr) 
	        {
	            if (num > max) 
	            {
	                secondMax = max;
	                max = num;
	            } else if (num > secondMax && num != max) 
	             {
	                secondMax = num;
	            }
	        }

	        return secondMax;
	    }

	    public static void main(String[] args) 
	    {
	        int[] numbers = {5, 8, 2, 10, 3};
	        
	        int secondMax = findSecondMax(numbers);
	        
	        System.out.println("Second maximum number: " + secondMax);
	    }
}
