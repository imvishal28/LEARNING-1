
public class cameraApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		camera c1=new camera("Black","Sony",2400);
		c1.caputreImage();
		c1.displyingImage();
		System.out.println("=====================================");
		camera c2=new camera("Yellow","canon",3400);
		c2.caputreImage();
		c2.displyingImage();

	}

}
