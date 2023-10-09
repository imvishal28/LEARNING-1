import java.util.Scanner;

public class moveToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of the Array");
		int a[]=new int[s.nextInt()];
		System.out.println("enter the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		
		System.out.println();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				a[count]=a[i];
				count++;
			}
		}
	
		for(int i=0;i<a.length;i++)
		{
		  if(b[i]<0)
		  {
			  a[count]=b[i];
			  count++;
		  }
		}
		
		System.out.println("the elements of  after puching to endthe array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		

	}

}
