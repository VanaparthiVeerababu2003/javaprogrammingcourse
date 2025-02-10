class Box
{	
	//int length,breadth,height;
	public int volume(int l,int b)
	{
		return l*b;
	}
	public int volume(int l,int b,int h)
	{
		return l*b*h;
	}
}
class OverMethod
{
	public static void main(String args[])
	{
	Box obj=new Box();
	System.out.println("volume of Box1 is:"+obj.volume(3,4));
	System.out.println("volume of Box2 is:"+obj.volume(5,6,7));
	}
}