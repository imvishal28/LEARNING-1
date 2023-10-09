package selectioSort;

public class SelectionSort {
	public void sort(int a[])
	{
		for(int i=0;i<=a.length-2;i++)
		{
			int min=a[i];
			int pos=i;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			int temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
			
			
		}
	}

}
