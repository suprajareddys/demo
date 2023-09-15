package kts;

 class buzz
{
	
	int x;
	int y;
	void add()
	{
		System.out.println(x+y);
	}
}

public class Practise extends buzz
	 {   
	   
		void sub()
		{
			System.out.println(x-y);
			
		}
	
		void add()
		{
			System.out.println(x);
			System.out.println(y);
			super.add();
			
		}
		
	public static void main(String[] args) 
	{
		Practise bobj=new Practise();
	
           bobj.x=10;
           bobj.y=20;
           bobj.add();
           bobj.sub();
           
           
	}

}
