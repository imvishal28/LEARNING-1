
public class PrintArray {

	public void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.print("===>"+a[i]+" ");
		}
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--)
		{
		System.out.print("===>"+a[i]+" ");
		}
		
	}
}
