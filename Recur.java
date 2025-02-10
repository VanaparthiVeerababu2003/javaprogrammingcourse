class Recur
{
    public int factorial(int n)
        {
            if(n==1)
            {
                return 1;
            }
            else
            {
                return n*factorial(n-1);
            }
        }
    public static void main(String args[])
    {
     Recur ob=new Recur();
     System.out.println("The factorial of 5 is:"+ob.factorial(5));
    }
}