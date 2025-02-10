class B 
{
    public void method()
    {
        System.out.println("class A");
    }
}
interface F
{
    public void method1();
}
interface G
{
    public void method2();
}
class Interface extends B implements F,G
{
    public void method1()
    {
        System.out.println("interface F");
    }
    public void method2()
    {
        System.out.println("interface G");
    }
    public void method3()
    {
        System.out.println("class C");
    }
    public static void main(String[] args) 
    {
     F f=new Interface();
     f.method1();
     G g=new Interface();
     g.method2();
     B b=new Interface();
     b.method();
     Interface c=new Interface();
     c.method3();

    }
    
}