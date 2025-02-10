class Callbyreference
{
	int x=10;
    public static void main (String args[])
    {
	Callbyreference cr=new Callbyreference();
        System.out.println("The value of x is:"+cr.x);
        increment(cr);
        System.out.println("The value of x after increment is:"+cr.x);
    }
    public static void increment(Callbyreference cr)
    {
        System.out.println("The value of x in this method is:"+cr.x);
        cr.x=cr.x+1;
    }
}