package shopping;
import java.util.Scanner;
public class nestedif {

	public static void main(String[] args) {
	System.out.println("WELCOME TO SHOP");
	Scanner v=new Scanner(System.in);
	System.out.println("Entre For whom You Want Dress");
	String gender=v.next();
	if ("boy"==gender)
	{
		System.out.println("What You Wamt");
		String cloth=v.next();
		
		if( ("shirt"==cloth) && ("jackets"==cloth)&& ("pants"==cloth)&& ("short"==cloth))
		{
			System.out.println("Showing Cloths....");
		}
	}
	System.out.println("BYE BYE ");
	

	}

}
