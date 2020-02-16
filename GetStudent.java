import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetStudent {

	public static void main(String[] args)
	{
	try
	{
			FileInputStream fIn=null;
		ObjectInputStream objIn=null;
		try 
		{
			fIn=new FileInputStream("Student.bin");
			
			objIn= new ObjectInputStream(fIn);
			
			while(objIn!=null)
			{
				Student stuInfo= (Student) objIn.readObject();
				
				
				System.out.println("Student information");
				System.out.println("student ID:"+stuInfo.getId());
				System.out.println("student first name:"+stuInfo.getFirstName());
				System.out.println("student last name:"+stuInfo.getLastName());
				System.out.println("student Course:"+stuInfo.getCourses());
				
			}
		
			
		}catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e) 
		{
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			if(objIn!=null)
				objIn.close();
			if(fIn!=null)
				fIn.close();
		}
	
		}catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
}
}
