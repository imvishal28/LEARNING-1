package DiffPatterns;
import java.text.DecimalFormat;
public class dammy {
	public static void main(String[] args) {
		
	String p="#.##";
float n=123656.256325632f;
double a=-846525.256325;
double b=0;
float c=-0.84685923f;
double e=-0.44685923;


DecimalFormat dc=new DecimalFormat(p);

System.out.format("%.3f",n);
/*System.out.println(Math.round(n));
System.out.println(Math.round(a));
System.out.println(Math.round(b));
System.out.println(Math.round(c));
System.out.println(Math.round(e));
System.out.println("======================================");

System.out.println(Math.floor(n));
System.out.println(Math.floor(a));
System.out.println(Math.floor(b));
System.out.println(Math.floor(c));
System.out.println(Math.floor(e));
System.out.println(Math.min(a, b));
System.out.println(Math.max(a, b));
System.out.println("======================================");

System.out.println(Math.ceil(n));
System.out.println(Math.ceil(a));
System.out.println(Math.ceil(b));
System.out.println(Math.ceil(c));
System.out.println(Math.ceil(e));*/


	}
}
