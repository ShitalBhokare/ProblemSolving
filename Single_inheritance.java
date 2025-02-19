package inheritanceProgram;

class Employee
{
	void salary()
	{
		System.out.println("Salary=500000");
	}
}
class Programmer extends Employee
{
	void bonus()
	{
		System.out.println("Bonus=50000");
	}
}


public class Single_inheritance {
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		p.salary();
		p.bonus();
	}

}
