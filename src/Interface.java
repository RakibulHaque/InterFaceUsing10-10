

interface fc1
{
	void studentName(String name);
	
}
interface fc2 extends fc1
{
	void studentRoll(int x);
	
}
interface fc3 extends fc2
{
	void studentAge(int x);
	
}

public class Interface implements fc3 
{
	public void studentName(String name)
	{
		
		System.out.println("Namme of student: "+name);
	}
	
	public void studentRoll(int x)
	{
		System.out.println("Roll of student: "+x);
	}


	public void studentAge(int x)
	{
		System.out.println("Age of student: "+x);
	}
	
	public static void main(String[] args)
	{
		Interface a = new Interface();
		a.studentName("sadik");
		a.studentRoll(1);
		a.studentAge(16);
	}

}
