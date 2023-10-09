import java.util.Scanner;

public class Copy2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=scan.nextInt();
		int n1=scan.nextInt();
		int arr[][]=new int[n][n1];
		int arr1[][]=new int[n][n1];
		System.out.println("Enter the elements ");
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
		
			arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("The elements are");
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.print(arr[i][j]+"|");
			
			}
			System.out.println();
		}
		
		System.out.println("the elements are coping...... ");
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			
			arr1[i][j]=arr[i][j];
			}
		}
		
		System.out.println("The copied elements are");
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
			System.out.print(arr[i][j]+"|");
			
			}
			System.out.println();
		}
		
		

	}

}
