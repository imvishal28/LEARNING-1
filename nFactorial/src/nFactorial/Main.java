package nFactorial;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		fact (n);

	}
	public static void fact(int num)
	{
		int sum=1;
				for (int i=1;i<=num;i++)
				{
					sum=sum*i;
				}
		System.out.println(sum);
	}

}
