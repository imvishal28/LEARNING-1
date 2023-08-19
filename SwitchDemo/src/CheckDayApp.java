import java.util.Scanner;
public class CheckDayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Any Number Between 1-7");
		Scanner v=new Scanner(System.in);
		int num=v.nextInt();
		CheckDay checkDay=new CheckDay();
		checkDay.whichDay(num);
		

	}

}
