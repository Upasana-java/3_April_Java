package com.assigment1;

public class GreatestNum 
{
        public static void main(String[] args) 
        {
			int a=100, b=200, c=300;
			
			if(a>=b && a>=c)
			{
				System.out.println("A Is Greatest Number " + a);
			}
			
			else if(b>=a && b>=c)
			{
				System.out.println("B Is Greatest Number " + b);
			}
			
			else if(c>=a && c>=b)
			{
				System.out.println("C Is Greatest Number " + c);
			}
		}
}
