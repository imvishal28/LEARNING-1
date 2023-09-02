package com.Kodnest.pattern.Level2;

public class PatternM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for (int i=0;i<=n;i++ )
		{
			for(int j=0;j<=n;j++)
			{
				if(j==0||j==n ||(i==j && i<=n/2)||(i==n-j && j>=n/2))
				{
					System.out.print("$");
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
