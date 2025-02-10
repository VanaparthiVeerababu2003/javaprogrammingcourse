interface Outer
{
    public void getShow();
    interface Inner
    {
        public void getDisplay();
    }
}
public class Nestedinterface  implements Outer,Outer.Inner
{
    public void getShow()
    {
        System.out.println("This is Outer method");
    }
    public void getDisplay()
    {
        System.out.println("This is Inner method");
    }
     public static void main (String args []) 
     {
         Outer out=new Nestedinterface();
         out.getShow();
         Outer.Inner i=new Nestedinterface();
         i.getDisplay();
     }
    
}
