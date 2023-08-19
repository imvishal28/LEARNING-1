import java.util.Scanner;
public class Main {
	public static void checkGrade(int grade)

	{

	if (grade>50)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("fail");
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int grade=scan.nextInt();
		checkGrade(grade);
	}

}
