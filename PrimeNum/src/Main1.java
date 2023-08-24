import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	primeNums(num);

	}
public static void primeNums(int num)
{
	vishal : for (int count=0;count<=num;)
	{
	for(int i=2;count<num;i++)
	{
		boolean res=primecheck(i);
		if (res==true)
		{
			System.out.println(i+"");
			count++;
			if (count==num)
			{
				break vishal;
			}
		}
		}
	}
}
	public static boolean primecheck(int num)
	{
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				
				return false;
			}
		}
		return true;
	}
}
