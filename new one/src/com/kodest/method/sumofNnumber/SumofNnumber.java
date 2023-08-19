package com.kodest.method.sumofNnumber;
import java.util.Scanner;
public class SumofNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method 
System.out.println("Enter the a number to find the sum upto it");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
sumOfNnumber(n);



	}
	public static void sumOfNnumber(float a)
	{
		float sum=a*(a+1)/2;
		
		System.out.println("The Sum Of N natural Number "+a+"is "+sum);
	}

}

