import java.util.Scanner;
class Teacher
{
	String name;
	int age;
	int experience;
	int rating;
	String getRating(int rating)
	{
		String result="Bad";
		if(rating == 5) 
		{
			result="Excellent";
		} 
		else if(rating == 4) 
		{
			result = "Good";
		} 
		else if(rating == 3) 
		{
			result = "Satisfactory";
		}
		return result;
	}
}

class Details {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many teacher are working in a college: ");
		int teacher = s.nextInt();	
		Teacher c[] = new Teacher[teacher];
		
		for(int i=0;i<teacher;i++) {
			c[i] = new Teacher();
		}
		for(int i=0;i<c.length;i++) {
			System.out.println("Enter Name of the Teacher "+(i+1)+" : ");
			s.nextLine();
			c[i].name = s.nextLine();
			System.out.print("Enter the age of the Teacher "+c[i].name+" : ");
			c[i].moduleCount = s.nextInt();
			System.out.print("Enter the Experience of Teacher "+c[i].name+" : ");
			c[i].videoCount = s.nextInt();
			System.out.print("Enter the given rating for the Teacher "+c[i].name+" : ");
			c[i].rating = s.nextInt();
		}
		System.out.println("\n:::::::Here are the details of the Teacher:::::::\n");
		for(int i=0;i<teacher;i++) {
			System.out.println("Teacher  "+(i+1)+" : ");
			System.out.println("Teacher Name : "+c[i].name);
			System.out.println("Age : "+c[i].age);
			System.out.println("Experience : "+c[i].experience);
			System.out.println("Rating : "+c[i].rating);
			System.out.println("Teacher is "+c[i].getRating(c[i].rating)+"...");
		}
	}
}
