import java.util.Scanner;

public class PowerraisedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entre a number to check Armstrong ");
		powerraised pr=new powerraised();
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int digit=pr.Digit(num);
		System.out.println(digit);
		long res=pr.power(num, digit);
		System.out.println(res);
		if (res==num)
		{
			System.out.println("The number "+res+ " is Armstrong");
		}
		else
		{
			System.out.println("The number "+res+ " is not a Armstrong");
		}
		
		

	}

}
