import java.util.Scanner;

public class AntiClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println("Entre number to rotate in Anit-ClockWise Rotation");
		int n=s.nextInt();
		anticlockwise(a,n);
		
		

	}
	public static void anticlockwise(int a[],int n)
	{
		for(int count=1;count<=n;count++)
		{
			int temp=a[0];
			for(int j=0;j<=a.length-2;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
