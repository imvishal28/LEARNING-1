package fibosum;
import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Fibo(num);
		

	}
	public static  void Fibo(int num)
	{
		int n=0;
		int n1=1;
		int n3,i;
		if(num==1)
		{
			System.out.println("0");
		}
		if(num==2)
		{
			System.out.println("0");
		}
		if (num>2)
		{
			System.out.print(n+" "+n1);
		for (i=3;i<=num;i++) {
			n3=n+n1;
			System.out.print(" " +n3+" ");
			n=n1;
			n1=n3;
			
		}
		}
	}

}
