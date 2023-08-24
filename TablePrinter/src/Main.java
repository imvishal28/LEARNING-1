import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stupubl
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		print(num);
		
		

	}
	public static void print(int num)
	{
		for (int i=1;i<=10;i++)
		{
			System.out.println(num +"x"+i +"=" +(5*i));
		}
	}

}
