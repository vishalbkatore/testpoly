package testpoly;

class Shape
{
	void draw()
	{
		System.out.println("it is drawing hh");  
	}
	
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("it is drawing round circle");
	}	
}
class Rectangle extends Shape
{
void draw()
{
System.out.println("it is drawing rectangle");	
}

}

public class Test43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		r1.draw();
		Circle c1=new Circle();
		c1.draw();

	}

}
