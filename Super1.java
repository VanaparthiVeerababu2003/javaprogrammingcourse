class Person
 { 
	public void Person() 
	{ 
		System.out.println("Person class Constructor"); 
	} 
} 
class Student extends Person 
{ 
	public void Student() 
	{ 
		System.out.println("Student class Constructor"); 
	} 
} 
class Super1 
{ 
	public static void main(String[] args) 
	{ 
		Student s = new Student(); 
	} 
}
