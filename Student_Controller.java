package com.controller;
import java.util.*;
import com.controller.Student_Controller;
import com.model1.Student;

public class Student_Controller {
	ArrayList<Student> Student = new ArrayList<>();
	
	
	public Student saveStudent(Student s)
	{
		Student.add(s);
		
		return s;
	}
	public Student findStudentById(int id)
	{
	   for(Student s : Student)
	   {
		   if(s.getId()==id)
		   {
			   return s;
		   }
		  
	   }
	   return null;
	}
	   public  boolean update_studentById(int id)
	   {
		   Student s = findStudentById(id);
		   if(s!=null)
		   {
			   s.setRelationship_status("single");
			   return true;
		   }
		   return false;
		   
	   }
	   public boolean deleteStudentById(int id)
		  {
			  Student s = findStudentById(id);
			  if(s!=null)
			  {
				  Student.remove(s);
				  return true;
			  }
			  return false;
		  }
	  public ArrayList<Student>   findall()
	  {
		  return Student;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		

	}

}
