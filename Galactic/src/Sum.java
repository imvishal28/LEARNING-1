import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Two Number");
		Scanner s1=new Scanner(System.in);
		long a=s1.nextLong();
		long b=s1.nextLong();
		long c=galacticAddition(a,b);
		System.out.println(c);
		
		

	}
	public static long galacticAddition(long num1,long num2)
	{
		return (num1+num2);
	}

}
