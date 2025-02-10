import java.util.Scanner;  
class Quadratic
{  
	public static void main(String arg[])   
	{  
	Scanner input = new Scanner(System.in);  
	System.out.println("Enter the value of a: ");  
	double  a = input.nextDouble();  
	System.out.println("Enter the value of b: ");  
	double b = input.nextDouble();  
	System.out.println("Enter the value of c: ");  
	double c = input.nextDouble();  
	double D= b * b - 4.0 * a * c;  
	if (D> 0.0)   
	{  
	double r1 = (-b + Math.sqrt(D)) / (2.0 * a);  
	double r2 = (-b - Math.sqrt(D)) / (2.0 * a);  
	System.out.println("The roots are " + r1 + " and " + r2);  
	}   
	else if (D == 0.0)   
	{  
	double r1 = -b / (2.0 * a);  
	System.out.println("The root is " + r1);  
	}   
	else   
	{  
	System.out.println("Roots are imaginary.");  
	}  
	}  
}  