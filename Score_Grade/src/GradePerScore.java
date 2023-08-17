
public class GradePerScore {
	void checkGrade(int marks)
	{
		if ((marks>=90))
				{
			System.out.println("A+ -  Grade");
			
				}
		else if (marks>=80  &&  marks<90)
		{
			System.out.println("A - Grade");
		}
		else if (marks>=70  &&  marks<80)
		{
			System.out.println("B - Grade");
		}
		else if (marks>=60  &&  marks<70)
		{
			System.out.println("C - Grade");
			
		}
		else if (marks>=50  &&  marks<60)
		{
			System.out.println("D - Grade");
		
		}
		else 
		{
			System.out.println("Fail....GOOD BYE");
		}
	}

}
