class Square
{
	int length;
	int breadth;
	int height;
	public int area()
	{
		return length* breadth;
	}
	Square()
	{
		System.out.println("This is a constructor");
	}
	Square(int l,int b)
	{
		length=l;
		breadth=b;
		
	}
	Square(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
}
public class ConstOver
{
	public static void main(String args[])
	{
		Square s1=new Square();
		Square s2=new Square(20,30);
		Square s3=new Square(5,6,7);
		System.out.println("Area of the Square is:"+s1.area());
		System.out.println("Area of the Square1 is:"+s2.area());
		System.out.println("Area of the Square2 is:"+s3.area());
	}
}
		