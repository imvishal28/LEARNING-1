
public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f1=new Fan();
		Fan f2=new Fan();
		Fan f3=new Fan();
		
		f1.noOfWing=3;
		f1.color="Black";
		f1.cost=4000;
		f1.brand="GM";
		
		System.out.println(f1.noOfWing+"Number of Wings");
		System.out.println(f1.color+"color");
		System.out.println(f1.cost+"cost");
		System.out.println(f1.brand+"Brand");
		
		f2.noOfWing=4;
		f2.color="white";
		f2.cost=3000;
		f2.brand="Crompton";
		
		System.out.println(f2.noOfWing+"Number of Wings");
		System.out.println(f2.color+"color");
		System.out.println(f2.cost+"cost");
		System.out.println(f2.brand+"Brand");
		
		
		
		f3.noOfWing=2;
		f3.color="Brown";
		f3.cost=2500;
		f3.brand="GM";
		 
		System.out.println(f3.noOfWing+"Number of Wings");
		System.out.println(f3.color+"color");
		System.out.println(f3.cost+"cost");
		System.out.println(f3.brand+"Brand");
		
		
		
		f1.FanCanRotate();
		f1.BlowAir();
		
		f2.FanCanRotate();
		f2.BlowAir();
		
		f3.FanCanRotate();
		f3.BlowAir();
		
	

	}

}
