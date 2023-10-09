import java.util.Scanner;

public class Addtion2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number of row and colunms");
		int row=s.nextInt();
		int columns=s.nextInt();
		int a[][]=new int [row][columns];
		int b[][]=new int [row][columns];
		int c[][]=new int [row][columns];
		
		System.out.println("enter the elements of the 1st matrix ");
		System.out.println(">>>>>>>>>>>>>.........>>>>>>>>>> ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("enter the element of the 1st matrix "+i+" "+j);
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the elements of the 2nd matrix ");
		System.out.println(">>>>>>>>>>>>>.........>>>>>>>>>> ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("enter the element of the 2nd matrix"+i+" "+j);
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("1st matrix.......>>>>>>>>>>>>>>>>");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("2nd matrix.......>>>>>>>>>>>>>>>>");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("Adding......>>>>>>>>>>>>>>>>");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}

		
	

	}


}
