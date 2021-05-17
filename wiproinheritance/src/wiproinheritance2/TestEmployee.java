package wiproinheritance2;

public class TestEmployee {
	public static void main(String[] args)
	{
		Person p= new Person("Arif");
		Employee e=new Employee("Jim",10000, 2015, "abcd"); 
		System.out.println(p); System.out.println(e);
		}
}
