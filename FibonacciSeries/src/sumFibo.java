import java.util.Scanner;

public class sumFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		fibo(num);
		scan.close();
		
		
		

	}
	public static void fibo(int num)
	{
		int n=0,n2=1,n3;
		System.out.print(n+" "+n2+" ");
		for (int i=2;i<=num;i++)
		{
			n3=n+n2;
			System.out.print(n3+" ");
			n=n2;
			n2=n3;
			
		}
	}

}
