class Vehicle
{
    int x=4;
    public void car()
    {
        System.out.println("The vehicle has "+ x +" wheels");

    }
}
class Bus extends Vehicle
{
    int x=8;
    public void bus()
    {
         System.out.println("The vehicle has "+ x +" wheels");
    }
}
class Single
{
    public static void main(String args[])
    {
         Bus b= new Bus();
         b.car();
         b.bus();

    }
}