
public class NoOfDigit {
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
