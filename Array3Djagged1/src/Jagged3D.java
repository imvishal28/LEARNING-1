import java.util.Scanner;

public class Jagged3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the 3D length of array");
		int a=s.nextInt();
		int marks [][][]=new int [a][][];
		
		for (int i=0;i<marks.length;i++)
		{
			System.out.println("entre the length of 2nd Array for each "+i+" class");
			marks[i]=new int[s.nextInt()][];
		}
		
		for (int i=0;i<marks.length;i++)
		{
			for (int j=0;j<marks[i].length;j++)
			{
				System.out.println("Enter the number of students in each of class"+j+" of school "+i); 
				marks[i][j]=new int[s.nextInt()];
			}
			
		}
		
		for(int i=0;i<marks.length;i++)
		{
			for (int j=0;j<marks[i].length;j++)
			{
				for(int k=0;k<marks[i][j].length;k++)
				{
					System.out.println("entre the marks of school "+i+"  of class "+j+"  of student "+k);
					marks[i][j][k]=s.nextInt();
				}
			}
		}
	
		System.out.println("The details of students marks");

		for(int i=0;i<marks.length;i++)
		{
			for (int j=0;j<marks[i].length;j++)
			{
				for(int k=0;k<marks[i][j].length;k++)
				{
					System.out.print(marks[i][j][k]+" | ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
	
		
	}

}
