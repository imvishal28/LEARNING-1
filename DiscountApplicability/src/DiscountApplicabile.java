import java.util.Scanner;
public class DiscountApplicabile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Entre the Purchase Amount");
		double a=s.nextDouble();
		checkDiscount(a);
		
		

	}
	public static void checkDiscount(double purchaseAmount )
	{
		if(purchaseAmount>100)
		{
		System.out.println("Discount Applicable");	
		}
		else
		{
			System.out.println("Discount is not Applicable");
		}
	}

}
