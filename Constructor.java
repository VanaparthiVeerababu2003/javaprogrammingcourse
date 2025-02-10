class Farm
{
	int length;
	int width;
	public int area()
	{
		return length* width;
	}
	Farm()
	{
		System.out.println("This is a constructor");
	}
}
public class Constructor
{
	public static void main(String args[])
	{
		Farm f1=new Farm();
		f1.length=10;
		f1.width=20;
		System.out.println("Area of the Farm is:"+f1.area());
	}
}
		