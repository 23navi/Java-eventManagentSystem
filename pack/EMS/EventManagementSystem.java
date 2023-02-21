package pack.EMS;
import java.util.*;
import java.io.*;


public class EventManagementSystem
{


	// Usage of array

	static ArrayList<BasicData> Admin;
	static ArrayList<BasicData> Client;

	public EventManagementSystem()	
	{
	 try{
		Admin = new ArrayList<BasicData>();
		Client = new ArrayList<BasicData>();

		BufferedReader in_Admin = new BufferedReader (new FileReader("Data/admin.txt"));
		BufferedReader in_Client = new BufferedReader (new FileReader("Data/client.txt"));
	
		String s;
		String id;
		String name;
		String password;
	
		while((s = in_Admin.readLine()) != null)
		{  
           		id = s.substring(3,s.indexOf("Name") - 2);
			name = s.substring(s.indexOf("Name") + 5, s.indexOf("Password") - 2);
			password = s.substring(s.indexOf("Password") + 9, s.length());

			BasicData obj = new BasicData(Integer.parseInt(id), name, password);
			Admin.add(obj);
		}

		while((s = in_Client.readLine()) != null)
		{ 
           		id = s.substring(3,s.indexOf("Name") - 2);
			name = s.substring(s.indexOf("Name") + 5, s.indexOf("Password") - 2);
			password = s.substring(s.indexOf("Password") + 9, s.length());

			BasicData obj = new BasicData(Integer.parseInt(id), name, password);
			Client.add(obj);
		}
		
		in_Admin.close();
		in_Client.close();
	    }
	    catch(Exception e)
	    {
		System.out.println(e);	
	    }	
	}


	public boolean AdminLogin()
	{
		Scanner in = new Scanner(System.in);
		String name;
		String password;

		System.out.print("\nEnter Admin's Name: ");
		name = in.nextLine();
		System.out.print("Enter Admin's Password: ");
		password = in.nextLine();

		for(int i = 0; i<Admin.size();i++)
		{
			if(Admin.get(i).getName().equals(name) && Admin.get(i).getPassword().equals(password))
				return true;
		}
		return false;
	}

	
	public boolean ClientLogin()
	{
		Scanner in = new Scanner(System.in);
		String name;
		String password;

		System.out.print("\nEnter Client's Name: ");
		name = in.nextLine();
		System.out.print("Enter Client's Password: ");
		password = in.next();

		for(int i = 0; i<Client.size();i++)
		{
			if(Client.get(i).getName().equals(name) && Client.get(i).getPassword().equals(password))
				return true;
		}
		return false;
	}

	public void showClientEvents()
	{
	 try{
		BufferedReader in = new BufferedReader (new FileReader("Data/event.txt"));
		String s;
		System.out.println("\nList of Events: ");
	
		while ((s = in.readLine()) != null)
			System.out.println("o "  + s);
	     }
	 catch(Exception e)
	 { }
	}	


	public boolean viewClientDetails()
	{
		System.out.print("\nDetails of All clients:.");
		for(int i = 0; i<Client.size();i++)
				Client.get(i).print();
		if(Client.size() > 0)
			return true;
		return false;
	}

	public boolean searchClientDetails()
	{
		System.out.print("Enter id of the specific client you want to search details of: ");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		
		for(int i = 0; i<Client.size();i++)
		{
			if(Client.get(i).getID() == id)
			{
				Client.get(i).print();
				return true;
			}
		}
		return false;
		
	}

	public boolean removeClient()
	{	
		System.out.print("Enter id of client you want to remove: ");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		
		for(int i = 0; i<Client.size();i++)
		{
			if(Client.get(i).getID() == id)
			{
				Client.remove(i);
				rewriteFile();
				return true;
			}
		}
		return false;
	}

	private static void rewriteFile()
	{
	 try{
		BufferedWriter out_Admin = new BufferedWriter (new FileWriter("admin.txt"));
		BufferedWriter out_Client = new BufferedWriter (new FileWriter("client.txt"));
		
		for(int i = 0; i < Admin.size();i++)
		{
			out_Admin.write("Id:" + Admin.get(i).getID() + ", ");
			out_Admin.write("Name:" + Admin.get(i).getName() + ", ");
			out_Admin.write("Password:" + Admin.get(i).getPassword());
			out_Admin.write("\n");
		}

		for(int i = 0; i < Client.size();i++)
		{
			out_Client.write("Id:" + Client.get(i).getID() + ", ");
			out_Client.write("Name:" + Client.get(i).getName() + ", ");
			out_Client.write("Password:" + Client.get(i).getPassword());
			out_Client.write("\n");
		}
		
		out_Admin.close();
		out_Client.close();

	     }
	 catch(Exception e)
	 { }
	}		
}	

