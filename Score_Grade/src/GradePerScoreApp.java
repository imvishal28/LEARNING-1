import java.util.Scanner;
public class GradePerScoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entre Your Marks");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		GradePerScore gps=new GradePerScore();
		gps.checkGrade(score);
		sc.close();

	}

}
