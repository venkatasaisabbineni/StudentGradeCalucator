package com.mile1.service;

import com.mile1.bean.*;

public class StudentService {
	public int findNumberOfNullMarksArray(Student s[])
	{
	           int x=0;
	           for(int i=0;i<s.length;i++)
	           {
	        	   if(s[i]==null)
	        	   {
	        		   
	        	   }
	        	   else if(s[i].getMarks()==null)
	        		   x++;
	           }
	           return x;
	}
	public int findNumberOfNullName(Student s[])
	{
		 int x1=0;
         for(int i=0;i<s.length;i++)
         {
        	 if(s[i]==null)
        	 {
        		 
        	 }
         else if(s[i].getName()==null)
      		   x1++;
         }
         return x1;
	                  
	}
	public int findNumberOfNullObjects(Student s[])
	{
		 int x2=0;
         for(int i=0;i<s.length;i++)
         {
      	   if(s[i]==null)
      		   x2++;
         }
         return x2;  
	}

}