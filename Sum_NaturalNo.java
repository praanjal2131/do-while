import java.util.*;
class Sum_NaturalNo
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	 System.out.print("\n\t\t\tPrint sum Natural numbers from 1 to n\n\n");
	
	System.out.print("\n\t\t\tEnter the value of n :");
	int n=sc.nextInt();
	int i=1;
	int sum=0;
	do
	{
	
		System.out.println("\t\t\t" +i);
		i++;
		sum=sum+i;
	}while(i<=n);
	System.out.println("\tSum of all Natural Numbers is=" +sum);
	
	}
}