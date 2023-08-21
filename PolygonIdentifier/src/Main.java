import java.util.Scanner;

public class Main {
	public static void identify(int sides)
	{
		switch (sides) {
		case 3 :
			System.out.println("Triangle");
			break;
		case 4 :
			System.out.println("Quadrilateral ");
			break;
		case 5 :
			System.out.println("pentagonal");
			break;
		case 6 :
			System.out.println("Hexagonal");
			break;
			
			default :
				System.out.println("polygonal");
			
		
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		identify( sides);
		scan.close();
		

	}

}
