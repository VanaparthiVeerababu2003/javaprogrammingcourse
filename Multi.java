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
		System.out.println(" It is a vehicle it contain no of wheels "+x);	
	}
	public void car()
	{
		int x=4;
		System.out.println(" It is a vehicle it contain  no of wheels "+x);	
	}
	public static void main(String args[])
	{
		Multi v=new Multi();
		v.bike();
		v.car();
	}
}