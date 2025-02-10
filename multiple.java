interface vehicle
{
	public void bike();
}
interface vehicle1
{
	public void car();
}
class Multi implements vehicle,vehicle1
{
	public void bike()
	{
		int x=2;
		System.out.println(" It is a vehicle it contain 2 wheels");	
	}
	public void car()
	{
		int x=4;
		System.out.println(" It is a vehicle it contain 4 wheels");	
	}
	public static void main(String args[])
	{
		vehicle v=new vehicle();
		v.bike();
		vehicle1 v1=new vehicle1();
		v1.car();
	}
}