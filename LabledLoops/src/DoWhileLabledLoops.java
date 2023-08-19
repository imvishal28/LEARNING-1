
public class DoWhileLabledLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=1;
		teju : do
		{
			int t=1;
			vishal : do
			{
				System.out.println("******");
				t++;
				break teju;
			
			}while (t<10);
			v++;
		}while (v<2);

	}

}
