class Box
{
    int x=10;
    public void myVal()
    {
        System.out.println("value of x is:"+x);
    }
}
class BoxVol extends Box
{
    int x=20;
    public void myVal()
    {
        System.out.println("value of x is:"+x);
        super.myVal();
    }
}
public class Superkey3
{
    public static void main (String args[])
    {
        BoxVol bv=new BoxVol();
        bv.myVal();
    }
}