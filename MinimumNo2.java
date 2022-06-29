//pending
import java.util.*;
class MinimumNo2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\n\t\tEnter any number :");
		int n=sc.nextInt();
	
		int i=n;
        	int k=0;
		int rem=0;
	do
	{
		 rem=i%10;
	  	 if(k>rem)
			
			k=rem;
			i=i/10;	
	}while(i!=0);
		
	  	System.out.print("\n\t\tmaximum no is: "+k);
	
	
	}
}
