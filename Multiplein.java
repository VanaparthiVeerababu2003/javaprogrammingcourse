interface interfaceA
{
    public void method1(int i);
}
interface interfaceB
{
    public void method2(int i);
}

public class Multiplein implements interfaceA,interfaceB
{ 
    public void display()
    {
        System.out.println("This is a multiple inheritance");
    }
    public void method1(int i)
    {
        System.out.println("The square of number in method1:"+i*i);
    }
    public void method2(int i)
    {
        System.out.println("The cube of number in method2:"+i*i*i);
    }
    public static void main (String args [])
     {
        
        interfaceA a=new Multiplein();
        a.method1(5);
        interfaceB b=new Multiplein();
        b.method2(5);
        Multiplein m=new Multiplein();
        m.display();
    }
    
}