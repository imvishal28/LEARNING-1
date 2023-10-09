import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Logic lg=new Logic ();
		System.out.println("Enter the length of array");
		int a[]=new int[s.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are.......");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int res=lg.NoOfTriangle(a);
		System.out.println("the Number Of Trinagle Can Be made Bye Using The elements Is>>"+res);
		

	}

}
