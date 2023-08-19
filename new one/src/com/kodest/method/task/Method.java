package com.kodest.method.task;
import java.util.Scanner;
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello WelCome to Program");
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the which operation to be exicuted");
		System.out.println("Add for additoin");
		System.out.println("Sub for Substraction");
		System.out.println("Mul for Multification");
        		String s=scan.nextLine();
        	System.out.println("Enter two two number");
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	int c=add(a,b);
        	int d=sub(a,b);
        	int e=mul(a,b);
        	System.out.println("THE ADDITOIN RESULT IS "+c);
        	System.out.println("THE SUBSTRACTION RESULT IS "+d);
        	System.out.println("THE MULTIFICATION RESULT IS "+e);
        	

	}
public static int add(int a,int b)
{
	return a+b;
}
public static int sub(int a,int b)
{
return a-b;	
}
public static int mul(int a,int b)
{
	return a*b;
}
}
