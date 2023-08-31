import java.util.Scanner;

public class powmathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		double num=scan.nextDouble();
		System.out.println("Enter the power");
		double power=scan.nextDouble();
		System.out.println(Math.pow(num, power));
		scan.close();

	}

}
