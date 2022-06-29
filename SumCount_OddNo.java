
/*wap to Print sum and count odd number from 1 to n   */


import java.util.*;
class SumCount_OddNo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint sum and count odd number from 1 to n\n\n");
	
	System.out.print("\n\t\t\tEnter the value of n :");
	int n=sc.nextInt();
	
	int i=1;
	int sum=0;
	int c=0;//count
	do
	{
	if(i%2==1)
	{
	System.out.print("\n\t\t\t"+i);
	sum=sum+i;
	
	c++;
	}
	i++;
	}while(i<=n);
	
	System.out.println("\n\tSum of all Odd Numbers is=" +sum);
	System.out.println("\tCount of all Odd Numbers is=" +c);
	}
}