import java.util.Scanner;

public class MoveAllTheZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int a[]=new int[s.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("array Elements Are.....");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		System.out.println();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				a[count]=a[i];
				count++;
			}
		}
		for(int i=count;i<a.length;i++)
		{
		  a[i]=0;
		}
		System.out.println("After moving Zero array Elements Are.....");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
