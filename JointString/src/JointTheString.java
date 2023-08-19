import java.util.Scanner;
public class JointTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter Your 1st Name");
		String a=s1.nextLine();
		System.out.println("enter Your 2nd Name");
		String b=s1.nextLine();
		System.out.println(joinString(a,b));

	}
	public static String joinString(String str1,String str2)
	{
		return (str1+"  "+str2);
	}

}
