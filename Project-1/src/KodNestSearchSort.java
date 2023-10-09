
public class KodNestSearchSort {
	int linearSearch(int arr[],int key)

	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key Found at "+i);
				return 0; 
			}
		}
             System.out.println("Key not Found");
	return 0;

	}

	int binarySearch(int arr[],int key)

	{
		bubbleSortAscending(arr);
		
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Key Found At "+mid);
				return 0;
			}else if(key>arr[mid])
			{
				low=mid+1;
			}else
			{
				high=mid-1;
			}
				
		}
		System.out.println("Key not Found");
	return 0;

	}
	void bubbleSortAscending(int arr[])

	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}

	void bubbleSortDescending(int arr[])

	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=0;j<=arr.length-2-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

	}

	void selectionSortAscending(int arr[])

	{
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}

	}

	void selectionSortDescending(int arr[])

	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}

	}

	void insertionSortAscending(int arr[])

	{
		for(int i=1;i<arr.length;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}

	}

	void insertionSortDescending(int arr[])

	{
		for(int i=1;i<arr.length;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}

	}

	int findMinimum(int arr[])

	{
		insertionSortAscending( arr);
		

	return arr[0];

	}

	int findMax(int arr[])

	{
		insertionSortAscending( arr);
	return arr[arr.length-1];

	}

}
