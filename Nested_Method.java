import java.util.*;
public class Nesting_Methods
{
    public int perimeter(int l,int b)
    {
        return 2*(l+b);
    }
    public int area(int l,int b)
    {
        int per=perimeter(2,5);
        return l*b;
    }
    public int volume(int l,int b,int h)
    {
        int ar=area(5,7);
        return l*b*h;
    }
    public static void main(String args[])
    {
        Nesting_Methods obj=new Nesting_Methods();
        obj.volume(7,8,9);
    
    }
}