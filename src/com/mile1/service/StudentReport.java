package com.mile1.service;

import com.mile1.bean.*;
import com.mile1.exception.*;

public class StudentReport {
	public String findGrade(Student studentObject)
	{
		int a[]=studentObject.getMarks();
		int i,flag=0,sum=0;
		String grade="";
		for(i=0;i<3;i++)
		{
			if(a[i]<35)
				flag=1;
			
		}
		if(flag==1)
			grade="F";
		else {
			for(i=0;i<3;i++)
			{
				sum+=a[i];
			}
			if(sum<=150)
				grade="D";
			else if(sum>150 && sum<=200)
				grade="C";
			else if(sum>200 && sum<=250)
				grade="B";
			else if(sum>250 && sum<=300)
				grade="A";
		}
		return grade;
	}
	public String validate(Student s)	throws NullStudentObjectException,NullNameException,NullMarksArrayException
	{
		String result="";
		try
		{
		if(s==null)
			throw new NullStudentObjectException();
		else
		{
			if(s.getName()==null||s.getName().isEmpty())
				throw new NullNameException();
			if(s.getMarks()==null)
				throw new NullMarksArrayException();
			else
				result=findGrade(s);
				
		}
		}
		catch(Exception e)
		{
			result=e.toString();
		}
		return result;
	}
}
