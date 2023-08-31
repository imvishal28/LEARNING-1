import java.util.Scanner;

public class powerNApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		
powerN p=new powerN();
System.out.println(p.sq(n,m));

	}

}
