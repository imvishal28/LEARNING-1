import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		checkpali(num);
		scan.close();
		
		
		}

	
	public static void checkpali(int num)
	{
		int temp,r;
		int sum=0;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=((sum*10)+r);
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}

}
