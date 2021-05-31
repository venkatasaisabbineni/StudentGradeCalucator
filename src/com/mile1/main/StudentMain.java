package com.mile1.main;

import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;

public class StudentMain {
	static	Student data[] = new Student[4];
	static{
		for (int i = 0; i <data.length; i++)  	data [i] = new Student ();  	
	 	data [0] = new Student ("Sekar", new int [] {85, 75, 95});
		data [1] = new Student(null, new int[]{11,22,33});
		data [2] = null;
		data [3] = new Student ("Manoj", null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService studentService = new StudentService ();	
		StudentReport studentReport = new StudentReport ();
			System.out.println ("Grade Calculator : ");
			String x = null;
			for (int i = 0; i < data.length; i++) {
		try {
		x = studentReport.validate (data [i]);
		} 
		catch (NullNameException e) {
		x="NullNameException occurred";	
		} 
		catch (NullMarksArrayException e) {
		x="NullMarksArrayException occurred";
		}
		catch (NullStudentObjectException e) { 
		x="NullStudentException occurred "; 
		}
		System.out.println ("GRADE of Student "+(i+1)+" = "+x);
		}
		System.out.println ("Number of Objects with Marks array as null = "+ studentService.findNumberOfNullMarksArray (data));
		System.out.println ("Number of Objects with Name as null= "+studentService.findNumberOfNullMarksArray(data));	
		System.out.println ("Number of Objects that are entirely null= "+ studentService.findNumberOfNullObjects(data));
		 }

}


