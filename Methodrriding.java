class X
 {
    public void display()
    {
        System.out.println("This is class x");
    } 
}  
class Y extends X
{
    public void display()
    {
        System.out.println("This is class y");
    }

}
class Z extends Y
{
    public void display()
    {
        System.out.println("This is class z");
    }
}
class Methodrriding 
{
    public static void main(String args []) 
    {
        X xobj=new X();
        Y yobj=new Y();
        Z zobj=new Z();
        xobj.display();
        yobj.display();
        zobj.display();
        xobj=new Y();
        xobj.display();
        xobj=new Z();
        xobj.display();

    }
    
}