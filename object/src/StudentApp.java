
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.id=1;
		s1.name="vishal";
		s2.name="shindhe";
		s1.branch="Cs";
		s2.branch="civil";
		s1.id=2;
		s1.eat();
		s1.sleep();
		s1.study();
		s2.eat();
		s2.sleep();
		s2.study();
		System.out.println("the id is ="+s1.id);
		System.out.println("the name is ="+s1.name);
		System.out.println("the branch is ="+s1.branch);
		
		System.out.println("the id is ="+s2.id);
		System.out.println("the name is ="+s2.name);
		System.out.println("the branch is ="+s2.branch);
	}

}
