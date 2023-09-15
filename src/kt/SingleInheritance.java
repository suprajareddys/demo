package kt;

class a1
{
	void su()
	{
	System.out.println("hello people");
	}
}
class a2 extends a1
{
	void sup()
	{
		System.out.println("hello world");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a2 ob=new a2();
		ob.sup();
		ob.su();
	}

}
