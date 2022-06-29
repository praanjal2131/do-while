import java.util.*;
class Print_OddNo
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);

		System.out.print("\n\t\t\tEnter 5digit number print only odd from the given Number ");
		//eg: 347843685===3 7 3 5
		System.out.print("\n\t\t\tEnter 5digit number :");
		int n = sc.nextInt();
		int i=0;
		int rem=0;
		do
		{
			if(i%2==1)
			{
				rem=i%10;
				System.out.print("\n\t\t\t"+rem+" ");
	 		}	i=i/10;
			 
		}while(i!=0);

	}
}

