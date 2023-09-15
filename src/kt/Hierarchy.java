package kt;


class c1
{
	int a=10,b=20;
	void v()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class c2 extends c1
{
	int c=30;
	void tae()
	{
		
		System.out.println(c);
	}
}
class c3 extends c1
{
	void taeh()
	{
		System.out.println("heeeeeeeeehaaaaa");
	}
	
}

public class Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	c2 ob=new c2();
		ob.tae();
		ob.v();   */
 c3 obj=new c3();
 obj.taeh();
 obj.v();
	}

}
