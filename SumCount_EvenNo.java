
/*wap to Print sum and count even number from 1 to n   */


import java.util.*;
class SumCount_EvenNo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint sum and count even number from 1 to n\n\n");
	
	System.out.print("\n\t\t\tEnter the value of n :");
	int n=sc.nextInt();
	
	int i=1;
	int sum=0;
	int c=0;//count
	do
	{
	if(i%2==0)
	{
	System.out.print("\n\t\t\t"+i);
	sum=sum+i;
	
	c++;
	}
	i++;
	}while(i<=n);
	
	System.out.println("\n\tSum of all Even Numbers is=" +sum);
	System.out.println("\tCount of all Even Numbers is=" +c);
	}
}