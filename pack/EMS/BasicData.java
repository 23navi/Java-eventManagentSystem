package pack.EMS;

public class BasicData
{
	int id;
	String name;
	String password;

	BasicData(int i, String n, String p)
	{
		id = i;
		name = n;
		password = p;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setID(int ID)
	{
		id = ID;
	}
	
	public void setName(String Name)
	{
		name = Name;
	}
	
	public void setPassword(String Password)
	{
		password = Password;
	}
	
	public void print()
	{
		System.out.println("\nID: " + id );
		System.out.println("Name: " + name );
		System.out.println("Password: " + password );	
	}
}	
	
