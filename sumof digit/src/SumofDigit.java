import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
sum(num);
	}
	public static void sum(int n)
	{
		int rem,temp;
		int sum=0;
		temp=n;
		int i;
		while (n>0)
		{
			rem=n%10;
			sum=rem+sum;
			n=n/10;
		}
		System.out.println(sum);
	}

}
