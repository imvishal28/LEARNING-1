package selectioSort;

import java.util.Scanner;

public class SelectionSortApp {

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
		 System.out.println("the Array Elements Befoe Selection Sort are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		 new SelectionSort().sort(a);
		 System.out.println("the Array Elements After Selection Sort are");
		 for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
				
			}
		 

	}

}
