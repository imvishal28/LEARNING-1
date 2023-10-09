import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the marks of the studets");
			arr[i]=scan.nextInt();
		}
		System.out.println(" marks of the studets are");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}

}
