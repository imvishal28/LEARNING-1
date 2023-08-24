import java.util.Scanner;

public class GcdOfTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		Gcd(n,m);

	}
	public static void Gcd(int n,int m)
	{
		int rem=0;
		while(n!=0)
		{
			rem=m%n;
			m=n;
			n=rem;
		}
		System.out.println(m);
	}

	}
	
