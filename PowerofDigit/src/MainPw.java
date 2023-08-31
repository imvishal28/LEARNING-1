import java.util.Scanner;

public class MainPw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		
		Pw p=new Pw();
		long l=p.Digit(n);
		long m=p.sq(n,l);
		System.out.println(m);

	}

}
