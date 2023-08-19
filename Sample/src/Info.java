import java.util.Scanner;

public class Info {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("entrr the info of student");
	System.out.println("Enter the student first Name");
	String a=scan.next();
	System.out.println("enter the Student Last Name");
	String b=scan.next();
	System.out.println("Enter the student Age");
	int c=scan.nextInt();
	System.out.println("Enter the Gender");
	String d=scan.next();
	System.out.println("Is the student Married ? say true or false");
	boolean e=scan.nextBoolean();
	System.out.println("Enter the Student Branch");
	String f=scan.next();
	System.out.println("Enter student Height ");
	float g=scan.nextFloat();
	System.out.println("Enter the Weight");
	float h=scan.nextFloat();
	System.out.println("THIS IS THE STUDENT INFO");
	System.out.println("FIRST NAME : "+a);
	System.out.println("LAST  NAME : "+b);
	System.out.println("AGE        : "+c);
	System.out.println("GENDER     : "+d);
	System.out.println("MARRIED    : "+e);
	System.out.println("STUDENT    : "+f);
	System.out.println("WEIGHT     : "+h);
	System.out.println("HEIGHT     : "+g);
	
	
}
}
