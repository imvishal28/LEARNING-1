import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[][][]=new int[3][3][4];
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				for (int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter the "+i+" school of "+j+" class of "+k+" student marks");
					arr[i][j][k]=s.nextInt();
				}
					
			}
				
		}
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr[i].length;j++)
			{
				for (int k=0;k<arr[i][j].length;k++)
				{
					System.out.print("|"+arr[i][j][k]+"|");
					
				}
				System.out.println();
					
			}
			System.out.println();
				
		}

	}

}
