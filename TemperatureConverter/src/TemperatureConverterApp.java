import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter temperatur to Convert");
		Scanner s1=new Scanner(System.in);
		double t=s1.nextDouble();
		TemperaturConverter t1=new TemperaturConverter ();
		System.out.println(t1.convertFahrenheitToCelsius( t));

	}

}
