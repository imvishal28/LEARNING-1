package ifElse;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entre your Age");
		Scanner v=new Scanner(System.in);
		int age=v.nextInt();
		IfElse s=new IfElse();
		s.CheckEligiility(age);
		

	}

}
