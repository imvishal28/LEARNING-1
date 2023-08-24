import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
calculateSum(num);

	}
 public static void calculateSum(int num)
 {
	 int sum= num*(num+1);
	 int sum2=sum/2;
	 System.out.println(sum2);
 }
}
