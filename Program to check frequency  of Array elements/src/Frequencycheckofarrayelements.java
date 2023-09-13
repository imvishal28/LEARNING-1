import java.util.Scanner;

public class Frequencycheckofarrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the array length");
		 int a=s.nextInt();
		 int arr[]=new int[a];
		 int fr[]=new int[a];
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("---------------------------");
			 System.out.println("entre the array elements"); 
			 arr[i]=s.nextInt();
		 }
		 System.out.println(" the array elements"); 
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 System.out.print(arr[i]+ " "); 
			
		 }
		 int visited=-1;
		 
		 System.out.println("Lets check the frequency of the array elements");
		 for(int i=0;i<arr.length;i++)
		 {
			 int count=0;
			 for (int j=0;j<arr.length;j++)
			 {
				 if(arr[i]==arr[j])
				 {	
					 count++;
					 
				 }
			 }
			 if(fr[i]!=visited) {
				 fr[i]=count;
			 
			 System.out.println("The frequency of "+arr[i]+" is ===>> "+count);
			 } 
		 }

	}

}
