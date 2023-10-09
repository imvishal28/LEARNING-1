import java.util.Scanner;

public class BinarySerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length od the array");
		int a[]=new int[s.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the Elements of the array");
			a[i]=s.nextInt();
		}
		System.out.println("the elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Enter the Key for serach ");
		int key=s.nextInt();
		int low=0;
		int high=a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==a[mid])
			{
				System.out.println("Key found At "+mid);
				return;
			}else if(key>a[mid])
			{
				low=mid+1;
			}else
			{
				high=mid-1;
			}
		}
		System.out.println("Key not found");
		

	}

}
