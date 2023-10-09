import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter an Element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Elements Are");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
