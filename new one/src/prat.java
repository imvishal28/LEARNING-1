import java.util.Scanner;

public class prat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		Scanner g=new Scanner (System.in);
		System.out.println("enter a your full name ");
		String s=g.nextLine();
		System.out.println("enter your Date of Birth");
		int a=g.nextInt();
whatEver(s);
int b=dOB(a);
System.out.println("Your Age is " +b);
	}
	public static void whatEver(String s)
	{
		
	System.out.println("Hello "+s+" How are you");
			
	}
     public static int dOB(int dob)
     {
    	int dob1=2023-dob;
    	return dob1;
     }
		
		
		
		
	}

