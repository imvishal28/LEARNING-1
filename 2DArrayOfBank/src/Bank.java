import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		String name[][]=new String [5][6];
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name[i].length;j++)
			{
				System.out.print("Enter the "+i+" Bank customer of "+j+" name :");
				name[i][j]=s.next();
			}
		}
		System.out.println("the Details of Banks With there customer");
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name[i].length;j++)
			{
				System.out.print("The Name of "+i+" Bank of "+j+"customer is "+name[i][j]);
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
