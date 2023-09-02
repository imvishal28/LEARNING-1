package com.Kodnest.PatternLevel3;

public class PatternU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for (int i=0;i<=n;i++ )
		{
			for(int j=0;j<=n;j++)
			{
				if(i==n||j==0 || j==n)
				{
					System.out.print("+");
				}
			else
			{
				System.out.print(" ");
			}
				
		}
			System.out.println();

	}

	}

}
