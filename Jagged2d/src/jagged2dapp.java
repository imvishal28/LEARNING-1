import java.util.Scanner;

public class jagged2dapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the legnth of the 1st Array");
		int a[][]=new int[s.nextInt()][];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the length "+i);
			a[i]=new int[s.nextInt()];
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			System.out.println("enter the Elements of "+i+" of "+j);
			a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("the elements are ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			System.out.println("enter the Elements of "+i+" of "+j+" is "+ a[i][j]);
			
			}
			System.out.println();
		}
		

	}

}
