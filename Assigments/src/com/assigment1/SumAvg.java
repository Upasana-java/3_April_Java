package com.assigment1;

import java.util.*;

public class SumAvg 
{
      public static void main(String[] args) 
      {
		      
    	  Scanner sc = new Scanner(System.in);
    	  
          int sum = 0;
          int avg = 0;
          
          System.out.println("Enter the 5 numbers: ");
          
          for(int i=1; i<=5; i++)
          {
              int num = sc.nextInt();
              sum +=  num;
          }
          
          System.out.println("The sum of the given number is " + sum);
          
          avg = sum/5;
          
          System.out.println("The average of the given number is " + avg);
          
          sc.close();

	  }
}
