
import java.util.*;
class MaximumNo2
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("\n\t\tEnter any number :");
		int n=sc.nextInt();
	
		int i=n;
        	int k=0;
		int rem=1;
	do
	{
		 rem=i%10;
	  	 if(rem>k)
			
			k=rem;
			i=i/10;	
	}while(i!=0);
		
	  	System.out.print("\n\t\tmaximum no is: "+k);
	
	
	}
}
