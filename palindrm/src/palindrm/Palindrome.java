package palindrm;

public class Palindrome {

	public  void checkpali(int num)
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
