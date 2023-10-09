
import java.util.Scanner;
public class Primeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to Check Prime");
		int n=s.nextInt();
		printPrime(n);
		/*
		if (res==true)
		
			System.out.println("The number is prime number");
		
		else
			System.out.println("The number is not prime number"); */
		
		

	}
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void printPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			boolean res1=isPrime(i);
			if(res1==true)
			{
			 System.out.print(i+" ");
			}
		}
	}

}
