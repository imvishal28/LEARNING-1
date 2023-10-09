import java.util.Scanner;

public class Symetrical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Matrix size");
		int n=s.nextInt();
		int m=s.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		int c[][]=new int[n][m];
		System.out.println("enter the elements of the 1st matrix elements");
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		
			a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the elements of the 2nd matrix elements");
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		
			b[i][j]=s.nextInt();
			}
		}
		System.out.println("The New MAtrix will of Size "+n+"x"+m);
		System.out.println(" elements of the 3rd matrix are");
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=0;
		      for(int k=0;k<m;k++)
		      {
		    	c[i][j]=c[i][j]+a[i][k] * b[k][j];
		      }
			}
		}
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print("|");
			for(int j=0;j<a[i].length;j++)
			{
		
			System.out.print(c[i][j]+"|");
			}
			System.out.println();
		}

	}

}
