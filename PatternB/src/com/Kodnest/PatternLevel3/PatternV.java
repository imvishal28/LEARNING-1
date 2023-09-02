package com.Kodnest.PatternLevel3;

public class PatternV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for (int i=0;i<=n;i++ )
		{
			for(int j=0;j<=n;j++)
			{
				if(i==j && j<=n/2 ||i<=n/2 && j==n-i )
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
