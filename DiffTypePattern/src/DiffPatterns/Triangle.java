package DiffPatterns;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
