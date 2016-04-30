package edu.gitdemo.domain;

public class LeapYear {

	public static void main(String args[]) 
	{
		int year = 2017;
		
		System.out.println("Remainder : " + year%4);
		
		System.out.println("Divide : " + year/4);
		
		if(year % 4 == 0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println(year + " is not a Leap year");
		}

	}

}
