import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
	public static void main(String[] args)
	{
		FileOutputStream out=null;
		ObjectOutputStream oos=null;
		try {
			out= new FileOutputStream(new File("Student.bin"));
			 oos= new ObjectOutputStream(out);
			
			System.out.println("JAV 444 WORKSHOP4&5");
			System.out.println("TASK 1");
			
			//input stream
			Scanner in= new Scanner(System.in);
			
			int option=0;
			int stdID=0;
			String firstName=null;
			String lastName=null;
			boolean invalid=false;
			
			
			
			do {
				Student stuInfo= new Student();
				System.out.println("1.Input student information");
				System.out.println("0.Exit");
				option=in.nextInt();
				
				switch (option)
				{
				
				case 1:
					//input student id,call setter
					do {
						System.out.println("Please input studentID");
						stdID=in.nextInt();
						if(stdID<=0)
						{
							invalid=true;
							System.out.println("Invalid studentID");
						}else 
						{
							stuInfo.setId(stdID);
							invalid=false;}
					}while(invalid==true);
					//input student first name

					do {
						System.out.println("Please input first name");
						firstName=in.next();
						if(firstName.length()<=2)
						{
							invalid=true;
							System.out.println("Invalid first name, need to have more than 2 charaters");
						}else {
							stuInfo.setFirstName(firstName);
							invalid=false;}
					}while(invalid==true);
					
					//last name
					do {
						System.out.println("Please input last name");
						lastName=in.next();
						if(lastName.length()<=2)
						{
							invalid=true;
							System.out.println("Invalid last name, need to have more than 2 charaters");
						}else {
							stuInfo.setLastName(lastName);
							invalid=false;}
					}while(invalid==true);
					
					//courses
					do {
						System.out.println("Please input course");
						String c=in.next();
						stuInfo.setCourses(c);
						invalid=false;
					}while(invalid==true);
					
					
					
					//write the object
					
					oos.writeObject(stuInfo);
					
					break;
					
				case 0:
					System.out.println("EXIT");
					break;
				}
			}while(option!=0);
			in.close();
			out.close();
			oos.close();
			
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
