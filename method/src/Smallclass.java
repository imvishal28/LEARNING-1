import java.util.Scanner;
public class Smallclass {

	public static void main(String[] args) {
	Scanner q=new Scanner(System.in);
	System.out.println("enter a number");
	int a=q.nextInt();
	System.out.println("enter a anthoer number");
	int b=q.nextInt();
	int add=add(a,b);
	System.out.println("enter your name");
	q.nextLine();
    String l=q.nextLine();
	
	System.out.println("the additoin is ="+ add);
	System.out.println("the name is ="+l);
	int sub=sub(a,b);
	System.out.println("the sub is ="+sub);
	

	}
public static int add(int x, int y)
{
	System.out.println("enter the name ");
	Scanner q=new Scanner(System.in);
	String d=q.nextLine();	
	int add1=x+y;
	return(add1);
	
}
public static int sub(int a, int b)
{
	int sub=b-a;
			System.out.println("enter a number ");
	Scanner q=new Scanner(System.in);
	int p=q.nextInt();
	int sub1=sub-p;
	return(sub1);
	
}
}
