import java.util.*;
class No_Separt2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("\n\tEnter the any number want to separate:");
		int n=sc.nextInt();
		//n=12345
		int rem=0;
		
		do
		{
			rem=n%10;
			System.out.print(" "+rem);
			n=n/10;

		}while(n!=0);

	}
}
