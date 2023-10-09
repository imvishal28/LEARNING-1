import java.util.Scanner;

public class Array3Djagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int marks [][][]=new int [2][][];
		
		marks[0]=new int [2][];
		marks[1]=new int [3][];
		
		marks [0][0]=new int [3];
		marks [0][1]=new int [4];
		marks [1][0]=new int [3];
		marks [1][1]=new int [2];
		marks [1][2]=new int [4];

		for(int i=0;i<marks.length;i++)
		{
			for (int j=0;j<marks[i].length;j++)
			{
				for (int k=0;k<marks[i][j].length;k++)
				{
					System.out.println("Entre the marks of "+i+" of school "+j+" of class "+k+"of student");
					marks[i][j][k]=s.nextInt();
				}
			}
		}
		System.out.println("the details of marks is ");
		for(int i=0;i<marks.length;i++)
		{
			for (int j=0;j<marks[i].length;j++)
			{
				for (int k=0;k<marks[i][j].length;k++)
				{
					System.out.print("|"+marks [i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
