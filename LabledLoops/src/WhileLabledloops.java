
public class WhileLabledloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		vishal : while(n<=10)
		{
			int m=1;
			shindhe : while (m <=10)
			{
				System.out.println("  ***** ");
				m++;
				break vishal;
			}
			System.out.println("yo yo");
			n++;
		}

	}

}
