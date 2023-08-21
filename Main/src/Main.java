import java.util.Scanner;
public class Main {
	public static void checkMultipleOfTen( int n)
	{
	int a=(n%10);
	if (a==0)
	{
		System.out.println("The number is a multiple of 10 ");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		checkMultipleOfTen(n);
	}

}
