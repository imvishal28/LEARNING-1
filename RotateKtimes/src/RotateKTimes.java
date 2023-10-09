import java.util.Scanner;

public class RotateKTimes {
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int a[]=new int[s.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("Entre number to rotate in ClockWise Rotation");
		int n=s.nextInt();
		clockwise(a,n);
		
		
	}

	public static void clockwise(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int count=1;count<=n;count++)
		{
			int temp=a[a.length-1];
			for(int j=a.length-2;j>=0;j--)
			{
				a[j+1]=a[j];
			}
			a[0]=temp;
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
