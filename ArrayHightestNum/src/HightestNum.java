import java.util.Scanner;

public class HightestNum {

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
		
		System.out.print("the Array elements are..... ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		

		System.out.print("the Highest Array elements is ..... ");
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				
					temp=a[i]; 
				}
			}
		
			
		}
		System.out.print(temp);


	}

}
