import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		KodNestSearchSort kss=new KodNestSearchSort();
		System.out.println("Enter the legnth of an Array");
		int arr[]=new int[s.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the element "+i);
			arr[i]=s.nextInt();
		}
		 System.out.println("the Array Elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		while(true)
		{
			System.out.println();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Enter Your Choice");
			System.out.println("Press1------>Searching");
			System.out.println("Press2------>Sortig");
			System.out.println("Press3------>Finding Minimum /Maximum");
			System.out.println("Press Any Other for TATA Bye Bye");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1 : System.out.println("LINEAR SEARCH --->1");
			          System.out.println("BINARY SEARCH --->2");
			          System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			          int choice1=s.nextInt();
			          System.out.println("Enter the Key to Search");
		        	  int key=s.nextInt();
			          if (choice1==1)
			          {
			        	 
			        	  kss.linearSearch(arr,key);
			          }else if(choice1==2)
			          {
			        	  kss.binarySearch(arr,key); 
			          }else
			          {
			        	  System.out.println("Go to home Bro");
			        	  return;
			          }
			          break;
			case 2 : System.out.println();
				     System.out.println("Press1---->Bubble Sort");        
			         System.out.println("Press2---->Selection Sort");        
			         System.out.println("Press3---->Insertion Sort"); 
			         System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			         int choice2=s.nextInt();
			         if(choice2==1)
			         {
			        	 System.out.println();
			        	 System.out.println("Press1--->Ascending sort");
			        	 System.out.println("Press2--->Descending sort");
			        	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			        	 int choice3=s.nextInt();
			        	 if(choice3==1) {
			        	 kss.bubbleSortAscending(arr);
			        	 System.out.println("the Array Elements after Ascending Bubble Sort are");
			     		for(int i=0;i<arr.length;i++)
			     		{
			     			System.out.print(arr[i]+" ");
			     			
			     		}
			         }else if(choice3==2)
			         {
			        		 kss.bubbleSortDescending(arr);
			        	 System.out.println("the Array Elements after Descending Bubble Sort are");
				     		for(int i=0;i<arr.length;i++)
				     		{
				     			System.out.print(arr[i]+" ");
				     			
				     		}
				         }
			        	 else {
			        		 System.out.println();
			        		 System.out.println("TATA BYE BYE");
			        		 return;
			        	 }
			        	 
			         }else if (choice2==2)
			         {   
			        	 System.out.println();
			        	 System.out.println("Press1--->Ascending sort");
			        	 System.out.println("Press2--->Descending sort");
			        	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			        	 int choice3=s.nextInt();
			        	 if(choice3==1) {
			        	 kss.selectionSortAscending(arr);
			        	 System.out.println("the Array Elements after Ascending Selection Sort are");
				     		for(int i=0;i<arr.length;i++)
				     		{
				     			System.out.print(arr[i]+" ");
				     			
				     		}
				         }
			        	 else if(choice3==2) {
			        		 kss.selectionSortDescending(arr);
			        		 System.out.println("the Array Elements after Descending Selection Sort are");
					     		for(int i=0;i<arr.length;i++)
					     		{
					     			System.out.print(arr[i]+" ");
					     			
					     		}
					         }
			        	 else {
			        		 System.out.println("TATA BYE BYE");
			        		 return;
			        		 }
			        	 
			         }else if(choice2==3)
			         {
			        	 System.out.println();
			        	 System.out.println("Press1--->Ascending sort");
			        	 System.out.println("Press2--->Descending sort");
			        	 System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			        	 int choice3=s.nextInt();
			        	 if(choice3==1) {
			        	 kss.insertionSortAscending(arr);
			        	 System.out.println("the Array Elements after Ascending Insertion Sort are");
				     		for(int i=0;i<arr.length;i++)
				     		{
				     			System.out.print(arr[i]+" ");
				     			
				     		}
				         }
			        	 else if(choice3==2) {
			        		 kss.insertionSortDescending(arr);
			        		 System.out.println("the Array Elements after Descending Insertion Sort are");
					     		for(int i=0;i<arr.length;i++)
					     		{
					     			System.out.print(arr[i]+" ");
					     			
					     		}
					         }
			        	 else
			        		 System.out.println("TATA BYE BYE");
			        	 
			         }else
			         {
			        	 System.out.println("TATA BYE BYE");
			        	 return;
			         }
			         break;
			case 3 :
				System.out.println();
				System.out.println("Press1----->Minimum");
				System.out.println("Press2----->Maximum");
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				int choice4=s.nextInt();
				if(choice4==1)
				{
					int res=kss.findMinimum(arr);
					System.out.println("The Minimum Element of an array is>>>>>"+res);
				} else if(choice4==2)
				{
					int res=kss.findMax(arr);
					System.out.println("The Max Element of an array is>>>>>>"+res);
					
				}else {
					System.out.println("TATA BYE BYE");
					return;
				}
				break;
				default :System.out.println("Go And Check Your eye");
				return;
			          
			}
		}

	}

}
