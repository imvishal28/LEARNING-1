
public class powerraised {
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
	long power(int num,int power)
	{
		int rem=1;
		long sum1=0;
		long sum2=0;
		while (num!=0)
		{
			rem=num%10;
			sum1=sq(rem,power);
		    sum2=sum1+sum2;
			num=num/10;
		}
		return sum2;
	}
	public int sq(int num,int power)
	{
		int res=1;
		for(int i=1;i<=power;i++)
		{
		res=(res*num);
		}
		return res;
	}

}
