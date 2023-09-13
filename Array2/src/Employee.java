import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[8];
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the employees names");
			arr[i]=scan.nextLine();
		}
		System.out.println("The Employees name are");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}

}
