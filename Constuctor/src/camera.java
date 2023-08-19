
public class camera {
	String color;
	String brand;
	int cost;
	
	void caputreImage()
	{
		System.out.println("Camera of "+brand+" Brand Caputurig Image of Camera Color  "+color+" Of Cost  "+cost);
	}
    void displyingImage()
    {
    	System.out.println("IMage is Displyig On Screen Of Brand "+brand);
    }
    public camera(String x,String y,int z)
    
    {
       color=x;
       brand=y;
       cost=z;
       
    }
    static void noObject()
    {
    	System.out.println("No Object is requried");
    }
}
