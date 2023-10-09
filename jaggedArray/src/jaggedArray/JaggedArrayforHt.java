package jaggedArray;

import java.util.Scanner;

public class JaggedArrayforHt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //Write your code here
       int mark[][]=new int [3][];
       for (int i=0;i<mark.length;i++)
       {
    	   System.out.println("entre the number of student in class "+i);
    	   int a=scanner.nextInt();
       mark[i]=new int [a];
       }
       
       for (int i=0;i<mark.length;i++)
       {
    	   for (int j=0;j<mark[i].length;j++)
    	   {
    		   System.out.println("entre the marks  class "+i+" of students"+j);
    		   mark[i][j]=scanner.nextInt();
    	   }
       }
       for (int i=0;i<mark.length;i++)
       {
    	   for (int j=0;j<mark[i].length;j++)
    	   {
    		   System.out.println(" the marks  class"+i+" of students"+j+"is :"+mark[i][j]);
	}
       }
       for (int i=0;i<mark.length;i++)
       {
    	   for (int j=0;j<mark[i].length;j++)
    	   {
    		   System.out.print("|"+mark[i][j]);
	}
    	   System.out.println();
       }
	}

}
