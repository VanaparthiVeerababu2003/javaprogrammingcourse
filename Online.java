
class Programming {

	public Programming()
	{
		System.out.println("Programming");
    }
	public Programming(int i, int j)
	{
		System.out.println("Programming "+i+j+);
	}
}

class DP extends Programming {

	public DP()
	{
		super(10, 20);
		System.out.println("DP");
	}
	public DP(int i, int j)
	{
		System.out.println("DP + +");
	}
}

// Main Class
public class Online {
	public static void main(String[] args)
	{
		DP obj = new DP();
	}
}
