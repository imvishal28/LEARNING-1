import java.util.Scanner;

public class SegregateEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int a[]=new int[s.nextInt()];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		Segregat(a);
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

	public static void Segregat(int[] a) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		int povt=a[0];
		while(j!=a.length-1)
		{
			if(a[j]%2==0)
			{
				
				int temp=a[i]; //swapping odd to even
				a[i]=a[j];
				a[j]=temp;
				i++;
				
				
			}
			j++;
		}
	    int temp=a[i];
	    a[i]=a[a.length-1];
	   a[j] =temp;
		
	}

}
