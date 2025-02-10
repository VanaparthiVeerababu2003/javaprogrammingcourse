abstract class Shape
{
    abstract public void area();
}
class Triangle extends Shape
{
    int b=3;
    int h=8;
    public void area()
    {
        System.out.println("Area of triangle"+0.5*h*b);
    }
}
class Rectangle extends Shape
{
    int l=6;
    int h=7;
    public void area()
    {
        System.out.println("Area of Rectangle:"+ l*h);
    }
}
class Abstract
{
    public static void main (String args[])
	{
    Shape t=new Triangle();
    t.area();
    Shape s=new Rectangle();
    s.area();
	}

}