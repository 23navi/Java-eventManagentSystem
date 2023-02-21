package pack.Accounts;

import java.util.*;
import java.io.*;




//Usage of interface 

class Account implements Serializable
{
	String name;
	int account_number;
	String pin;
	double Amount;

	Account()
	{
		name = null;
		account_number = 0;
		pin = null;
		Amount = 0;	
	}
	
	Account(String n, int acc, String pi, double amount)
	{
		name = n;
		account_number = acc;
		pin = pi;
		Amount = 1000 + amount;	
	}

	public void setName(String n)
	{
		name = n;
	}

	public void setAccountNumber(int n)
	{
		account_number = n;
	}

	public void setPIN(String p)
	{
		pin = p;
	}

	public void setAmount(double a)
	{
		Amount = a;
	}

	public String getName()
	{
		return name;
	}

	public int getAccountNumber()
	{
		return account_number;
	}

	public String getPIN()
	{
		return pin;
	}

	public double getAmount()
	{
		return Amount;
	}

}

