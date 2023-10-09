import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];

		
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print("enter the elements of an array : ");
			 arr[i]=s.nextInt();
		 }
		System.out.println("array contents RE :");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
			
		 }


	}

}
