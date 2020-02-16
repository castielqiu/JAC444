import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable
{
	private int stdID;
	private String firstName;
	private String lastName;
	ArrayList<String> Courses = new ArrayList<String>();
	
	//empty constructor
	Student(){};
	//parameterized constructor
	Student(Integer stdID,String firstName,String lastName, ArrayList<String> Courses)
	{
		this.stdID=stdID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Courses=Courses;
		
	}
	
	
	//get student id
	public int getId()
	{
		return stdID;
	}
	
	//get firstname
	public String getFirstName()
	{
		return firstName;
	}
	
	//get lastname
	public String getLastName()
	{
		return lastName;
	}
	
	//get courses
	public ArrayList<String> getCourses()
	{
		return  Courses;
	}
	
	//setters
	
	//set id
	public void setId(int id)
	{
		this.stdID=id;
	}
	//set firstName
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	//set lastname
	
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	//set courses
	
	public void setCourses(String courses)
	{
		this.Courses.add(courses);
	}
	
}
