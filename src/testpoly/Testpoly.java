package testpoly;

class Parent
{
	void marry()
	{
		System.out.println("you must mary with sita");
		
	}
	
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("i marry with only geeta");
	}
	
}
//Child ISA part of Parent
public class Testpoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1=new Child();
		
		p1.marry();
	}

}
