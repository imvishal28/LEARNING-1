import java.util.Scanner;
public class CheckEligibilituApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entre your Age");
		Scanner v=new Scanner(System.in);
		int age=v.nextInt();
		Check s=new Check();
		s.CheckEligibility(age);
		v.close();
		

	}

}
