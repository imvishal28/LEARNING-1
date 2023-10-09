import java.util.Scanner;

public class ArrayCallMathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintArray pa=new PrintArray();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array length");
		int a[]=new int[s.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		pa.printArray(a);
		

	}

}
