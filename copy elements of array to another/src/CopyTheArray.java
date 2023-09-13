import java.util.Scanner;

public class CopyTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array elements");
		int ori[]=new int [5];
		for (int i=0;i<ori.length;i++)
		{
			System.out.println("entre the "+i+" elements");
			ori[i]=s.nextInt();
		}
		System.out.println("the Array Elements Are");
		for (int i=0;i<ori.length;i++)
		{
			System.out.println("|"+ori[i]+"|");
			
		}
		
		System.out.println("Lets copy the elements of the array");
		int copy[]=new int [5];
		for (int i=0;i<copy.length;i++)
		{
			copy[i]=ori[i];
		}
		
		System.out.println("The copied elements are ");
		for (int i=0;i<ori.length;i++)
		{
			System.out.print(copy[i]+"|");
			
		}
		

	}

}
