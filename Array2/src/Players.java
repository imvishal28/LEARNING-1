import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		float arr[]=new float[10];
		for (int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the players height :");
			arr[i]=scan.nextFloat();
		}
		System.out.println("The height of the players is");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}


		
	}

}
