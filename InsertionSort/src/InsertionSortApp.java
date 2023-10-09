import java.util.Scanner;



public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the legnth of the 1st Array");
		int a[]=new int[s.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the element "+i);
			a[i]=s.nextInt();
		}
		System.out.println("the Array Elements before Insertion Sort are");
		 for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
				
			}
		 System.out.println();
		 new InsertionSort().sort(a);
		 System.out.println("the Array Elements After Insertion Sort are");
		 for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
				
			}
		 

	}

}
