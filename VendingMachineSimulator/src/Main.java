import java.util.Scanner;


public class Main {
	public static void getproduct(String proCode)
	{
		switch (proCode)
		{
		case "P01" :
			System.out.println("pepsi");
			break;
		case "P02" :
			System.out.println("Cocacola");
			break;
		case "P03" :
			System.out.println("Jaljeera");
			break;
		case "P04" :
			System.out.println("Mountai");
			break;
			default :
				System.out.println("panka");
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String proCode=scan.nextLine();
		getproduct(proCode);

	}

}
