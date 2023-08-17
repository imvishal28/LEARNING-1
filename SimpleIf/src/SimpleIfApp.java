import java.util.Scanner;
public class SimpleIfApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter The Makrs");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		s.close();
		System.out.println("Welcome To Kodenst");
		Check(marks);

	}
	public static void Check(int a)
	{
		if (a>=80)
		{
			System.out.println("Welcome To TechHub");
		}
	}
}
