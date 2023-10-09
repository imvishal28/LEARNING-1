import java.util.Scanner;

public class Add2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=scan.nextInt();
		int n1=scan.nextInt();
		int arr1[][]=new int[n][n1];
		int arr2[][]=new int[n][n1];
		int arr3[][]=new int[n][n1];
		System.out.println("Enter the elements ");
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
		
			arr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the elements of array2 ");
		for (int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
		
			arr2[i][j]=scan.nextInt();
			}
		}
		System.out.println("The elements are");
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
			System.out.print(arr1[i][j]+"|");
			
			}
			System.out.println();
		}
		System.out.println("The elements are of array2");
		for (int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
			System.out.print(arr2[i][j]+"|");
			
			}
			System.out.println();
		}
		
		
		System.out.println("the elements are Adding...... ");
		for (int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
			
			arr3[i][j]=(arr1[i][j])+(arr2[i][j]);
			}
		}
		
		System.out.println("The Added elements are");
		for (int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
			System.out.print(arr3[i][j]+"|");
			
			}
			System.out.println();
		}

	}

}
