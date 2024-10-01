package com.assigment1;

import java.util.Scanner;

public class Alphabet 
{
             
	public static void main(String[] args) 
	{
	        
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter an alphabet: ");
		 char ch=sc.next().charAt(0);
		 
		 if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
		 {
			 System.out.println("It Is Vovel");
		 }
		 else if(ch<=64 ||ch>=123)
		 {
			 System.out.println("Error: Plzz Enter Valid Letter");
		 }
		 else
		 {
			 System.out.println("It Is Consonant");
		 }
		 
				sc.close(); 
	   }
}
