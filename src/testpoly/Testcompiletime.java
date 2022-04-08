package testpoly;
class Test21
{
int add(int i,int j)	
{
double s=i+j;
System.out.println(s);
return 0;

}
int add(int i,int j,int k)
{
	int l=i+j+k;
	System.out.println(l);
	return l;	
}
}

public class Testcompiletime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test21 t1=new Test21();
		t1.add(10, 20, 30);
		t1.add(10, 20);
		

	}

}
