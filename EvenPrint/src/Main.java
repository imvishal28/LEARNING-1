import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		printEven(a);
				

	}
	public static void printEven(int num)
	{
		for (int i=1;i<=num;i++)
	
		{
			if (i%2==0)
			{
				
				System.out.print(i);
				i++;
			}
			System.out.print("");
		}
	}

}
