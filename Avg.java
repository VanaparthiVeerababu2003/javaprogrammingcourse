import java.util.*;
class Avg
{
	public static void main (String arg[])
	{
	double a1,a2,a3,a4,a5,avg;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter speed of racer1:");
	a1 = input.nextDouble();
	System.out.println("Enter speed of racer2:");
	a2 = input.nextDouble();
	System.out.println("Enter speed of racer3:");
	a3 = input.nextDouble();
	System.out.println("Enter speed of racer4:");
	a4 = input.nextDouble();
	System.out.println("Enter speed of racer5:");
	a5 = input.nextDouble();
	avg=(a1+a2+a3+a4+a5)/5;
	System.out.println("the average is"+avg);
	if(a1>avg)
	{
		System.out.println(" racer 1 is qualified");
	}
	else if(a2>avg)
	{
		System.out.println(" racer 2 is qualified");
	}
	else if(a3>avg)
	{
		System.out.println(" racer 3 is qualified");
	}
	else if(a4>avg)
	{
		System.out.println(" racer 4 is qualified");
	}
	else if(a5>avg)
	{
		System.out.println(" racer 5 is qualified");
	}
	else
	{
		System.out.println("no one is qualified");
	}
	}
}
