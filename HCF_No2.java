import java.util.*;
class HCF_No2 //highest common factor
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("\n\t\tEnter the number a :");
	int a=sc.nextInt();

	System.out.print("\n\t\tEnter the number b :");
	int b=sc.nextInt();
	int i=1;
	
	int hcf=0;
	do
	{
		if(a%i==0 && b%i==0)
		hcf=i;
		i++;
	}while(i<=a || i<=b);
		
	
	System.out.print("\n\t\tHCF Number is : "+hcf);
	
	
	}
}
