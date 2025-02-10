class Call 
{
    public static void main (String args[])
    {
        int x=10;
        System.out.println("The value of x is:"+x);
        increment(x);
        System.out.println("The value of x after increment is:"+x);
    }
    public static void increment(int x)
    {
        System.out.println("The value of x in this method is:"+x);
        x=x+1;
    }
}