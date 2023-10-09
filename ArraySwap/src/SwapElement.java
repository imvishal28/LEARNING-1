import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array length");
		int a[]=new int[s.nextInt()];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
		 a[i]=s.nextInt();	
		}
		System.out.println("Entre the 2 index to swap ");
		int c=s.nextInt();
		int b=s.nextInt();
		System.out.println("The array elements before swapping");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" | ");
		}
		System.out.println();
	     int d;
	     d=a[c];
	     a[c]=a[b];
	     a[b]=d;
	     System.out.println("The array elements after swapping");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" | ");
			}
	     
	
		

	}

}
