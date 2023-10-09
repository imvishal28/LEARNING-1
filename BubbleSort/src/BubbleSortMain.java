import java.util.Scanner;

public class BubbleSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BubbleSort bs=new BubbleSort();
		System.out.println("Enter the Length of an Array");
		int a[]=new int[s.nextInt()];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array Elements Before the Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		bs.sort(a);
		System.out.println();
		System.out.println("Array Elements After the Sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
