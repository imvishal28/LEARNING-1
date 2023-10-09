package DiffPatterns;

public class PalindromeTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		int n=5;
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=2*(n-i);j++)
			{
				System.out.print(" ");
			}
			for (k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			for (int m=2;m<=i;m++)
			{
				System.out.print(m+" ");
			}
			System.out.println();
		}

	}

}
