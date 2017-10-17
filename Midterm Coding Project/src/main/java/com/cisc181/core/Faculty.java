package com.cisc181.core;

import java.util.Date;

public class Faculty extends Employee {

	private String OfficeHours;
	private int Rank;

    public void setofficeHours(String officeHours)
    {
        this.OfficeHours = officeHours;
    }

    public String getofficeHours()
    {
        return this.OfficeHours;
    }
    
    public void setrank(int rank)
    {
        this.Rank = rank;
    }

    public int getrank()
    {
        return this.Rank;
    }    
    
	public Faculty(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate) throws PersonException 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		this.OfficeHours = officeHours;
		this.Rank = rank;
	}

}