class Box
{
	private int height;
	private int width;
	public int area()
	{
		return height*width;
	}
	public int getwidth()
	{
		return width;
	}
	public int getheight()
	{
		return heighth;
	}
	public void setheight()
	{
		height=h;
	}

	public void setweight()
	{
		weight=w;
	}
	
}
class Private
{
	public static void main(String args[])
	{
		Box b=new Box();
		b.setwidth=3;
		b.setheight=5;
		System.out.println("Area of Box is:"+b.area());
	}
}