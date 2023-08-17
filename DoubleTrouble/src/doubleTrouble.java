import java.util.Scanner;
public class doubleTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a numer");
		int num=s1.nextInt();
		System.out.println(DoubleTheNumber( num));


	}
	public static int DoubleTheNumber(int num)
	{
		return(2*num);
	}

}
