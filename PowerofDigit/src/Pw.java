
public class Pw {
	public int sq(int num,long power)
	{
		int res=1;
		for(int i=1;i<=power;i++)
		{
		res=(res*num);
		}
		return res;
	}
	int Digit(int num)
	{
		int res;
		int temp=0;
		while(num!=0)
		{
			res=num%10;
			num=num/10;
			temp++;
		}
		return temp;
	}


}
