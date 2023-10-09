import java.util.Scanner;

public class MargeOfTwoInto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int a[]=new int[s.nextInt()];
		int b[]=new int[s.nextInt()];
		
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
		
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++)
		{
			
			c[i]=b[j];
			j++;
		}
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
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		

	}

}
