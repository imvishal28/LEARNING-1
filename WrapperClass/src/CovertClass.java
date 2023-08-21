import java.util.Scanner;
public class CovertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=66;
		Character j=(char)a;
		System.out.println(j);
		char b='C';
		Integer i=(int)b;
		System.out.println(i);
		
		
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = scan.next().charAt(0);
	        identifyCharacter(ch);
	    
	}
	public static void identifyCharacter(char ch)
	{
		 if (Character.isLowerCase(ch)) {
	            if (isVowel(ch)) {
	                System.out.println("Lower-case vowel");
	            } else {
	                System.out.println("Lower-case consonant");
	            }
	        } else if (Character.isUpperCase(ch)) {
	            if (isVowel(ch)) {
	                System.out.println("Upper-case vowel");
	            } else {
	                System.out.println("Upper-case consonant");
	            }
	        } else if (Character.isDigit(ch)) {
	            System.out.println("Digit");
	        } else {
	            System.out.println("Special character");
	        }
	        
	        
	    }
	
    public  static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
}


