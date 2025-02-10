
class Bank
{
    public void sbi()
    {
        int x=200;
        System.out.println("This is a SBI account");
        System.out.println("No of customers:"+x);
        
    }
}
class Union extends Bank
{
    public void union()
    {
        int x=100;
        System.out.println("This is a UNION account");
        System.out.println("No of customers:"+x);
        
    }
}
class  Axis extends Union
{
    public void axis()
    {
        int x=50;
        System.out.println("This is a AXIS account");
        System.out.println("No of customers:"+x);
        
    }
}
class Multilevel
{
    public static void main(String args[])
    {
         Axis a= new Axis();
         a.sbi();
         a.union();
         a.axis();

    }
}