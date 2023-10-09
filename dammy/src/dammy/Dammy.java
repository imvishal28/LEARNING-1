package dammy;

import java.util.Random;
import java.util.Scanner;

public class Dammy {
	private static char[] hashcode;

	public static void main(String[] args) { 
		
		Scanner b=new Scanner(System.in);
		String s1="vishal";
		String s2="Vishal";
		
		byte ascii[] = {85,72,70};
		String s5=new String(ascii);
		String s6=new String(ascii,1,2);
		System.out.println(s5);
		System.out.println(s6);
		if(s1.equalsIgnoreCase(s2))
			System.out.println("same");
		else
			System.out.println("not same");
		
		System.out.println(">>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		byte st[]= {66,67,68,69};
		String g=new String(st);
		String l=new String(g);
		System.out.println(g);
		System.out.println(l);
		
		

	
		
			
		
	}
}

	
	


