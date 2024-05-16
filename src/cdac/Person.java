package cdac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person 
{
	private int Id;
	private String Name;
	private String Mob;
	private Date DOB;
	
	
	public Person()
	{
		this.Id = 0;
		this.Name = null;
		this.Mob = null;
		this.DOB = null;
		
	}
	public Person(int id,String nm,String M,Date dob)
	{
		this.Id = id;
		this.Name = nm;
		this.Mob = M;
		this.DOB=dob;
	}
	
	//Getter and setter
	public void setId(int id)
	{
		this.Id = id;
		
	}
	public void setName(String nm)
	{
		this.Name = nm;
	}
	public void setMob(String M)
	{
		this.Mob = M;
	}

	public void setDOB(Date d)
	{
		this.DOB=d;
	}
	
	public int getId()
	{
		return Id;
	}
	public String getName()
	{
		return Name;
	}
	public String getMob()
	{
		return Mob;
		
	}
	public Date getDOB()
	{
		return DOB;
	}
	public String toString(){
		//for proper format we used
		   SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		   String d=sdf.format(DOB);
	      return "Id :"+ Id+"Name : "+Name+"mobile: "+Mob+"dob"+d;
	   }
	
	  

		 
	}
	

