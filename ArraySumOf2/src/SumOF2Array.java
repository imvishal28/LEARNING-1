import java.util.Scanner;

public class SumOF2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int a[]=new int[s.nextInt()];
		int b[]=new int[a.length];
		
		System.out.println("Enter the elements of 1st array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the elements of 2nd array");
		for(int i=0;i<a.length;i++)
		{
			b[i]=s.nextInt();
		}
		int c[]=new int[a.length];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		
		
		
	}

}
