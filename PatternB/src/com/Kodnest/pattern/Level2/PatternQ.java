package com.Kodnest.pattern.Level2;

public class PatternQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for (int i=0;i<=n;i++ )
		{
			for(int j=0;j<=n;j++)
			{
				if((i==0 && j<=n/2)||(j==0 && i<=n/2) 
						||(j==n/2 && i<=n/2)||(i==n/2 && j<=n/2)||i==j && j>=4 && j<=n-3)
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
