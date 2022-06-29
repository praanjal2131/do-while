/*wap to Print Even numbers from 1 to 100*/


import java.util.*;
class DoWhileQ2
{
	public static void main(String[] args)
	{
	//Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint Even numbers from 1 to 100\n\n");
	int n=1;
	int i=0;
	do
	{
	if(n%2==0)
	System.out.println("\t" +n);
	n++;
	}while(n<=100);
	
	
	}
}