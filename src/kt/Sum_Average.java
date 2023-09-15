package kt;

import java.util.Scanner;

public class Sum_Average {

	public static void main(String[] args) 
	{			
	     int even_sum=0,odd_sum=0;
	     int avgof_ev=0,avgof_odd=0;
	     int count_even=0,count_odd=0;
	     
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the size");
	     int size=sc.nextInt();
	    int a[]=new int[size];
	    
	    System.out.println("enter the numbers");
	    
	     for(int i=0;i<a.length;i++)
	     {
	    	 a[i]=sc.nextInt();
	    	 if(a[i]%2==0)
	    	 {
	    		even_sum=even_sum+a[i];
	    		count_even++;
	    	 }
	    	 else
	    	 {
	    	   	 odd_sum=odd_sum+a[i];
	    	   	 count_odd++;
	    	 }
	     }
	     System.out.println("sum of even numbers   "+even_sum);
	     System.out.println("sum of odd numbers   "+odd_sum);
	     
	     avgof_ev=even_sum/count_even;
	     avgof_odd=odd_sum/count_odd;
	     
	     System.out.println("avg of even numbers   "+avgof_ev);
	     System.out.println("avg of odd numbers   "+avgof_odd);
	}

}
