import java.util.Random;
public class randomclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize random number generator
				Random random = new Random();
				
				//generates boolean value
				System.out.println(random.nextBoolean());
				
				//generates double value
				System.out.println(random.nextDouble());
				
				//generates float value
				System.out.println(random.nextFloat());
				
				//generates int value
				System.out.println(random.nextInt());
				
				//generates int value within specific limit
				System.out.println(random.nextInt(20));

	}

}
