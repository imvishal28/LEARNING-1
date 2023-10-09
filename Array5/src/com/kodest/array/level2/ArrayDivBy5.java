package com.kodest.array.level2;

import java.util.Scanner;

public class ArrayDivBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 System.out.println("Entre the length of a array");
		 int a[]=new int[s.nextInt()];
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=s.nextInt();
		 }
		 System.out.println("The Factor of 5 Array elements are");
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]%5==0)
			 {
				 System.out.print(""+a[i]+" | ");
			 }
		 }

	}

}
