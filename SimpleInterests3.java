/*wap to calculate si for next 10 years*/



import java.util.*;
class SimpleInterests3
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);

System.out.print("\n\t\t\tEnter the principal amount:");
double p= sc.nextDouble();

System.out.print("\n\t\t\tEnter the rate of interest :");
double r=sc.nextDouble();
int t=10;

int year=1;
do
{
if(year<=10)
{
System.out.println("\n\t\t\ttime in years:"+year);

double si=(p*r*year)/100;

System.out.print("\n\t\t\tthe principal amount ="+p);
System.out.print("\n\t\t\tthe rate of interest ="+r);
System.out.print("\n\t\t\tSimple Interest is =" +si);

/*double pa=p+si;
System.out.print("\n\t\t\t================================");

System.out.print("\n\t\t\tthe rate of payable amount ="+pa);*/
}

year++;
}while(year<=10);
}
}