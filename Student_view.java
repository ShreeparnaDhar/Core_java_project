package com.view;
import java.util.Scanner;
import java.util.*;
import com.controller.Student_Controller;
import com.model1.Student;

public class Student_view {
     private static Scanner sc = new Scanner(System.in);
	
	public static Student getstudentobject()
	{
		Student s = new Student();
		System.out.println("Enter the Id:");
		int id = sc.nextInt();
		System.out.println("Enter the name :");
		sc.nextLine();
		String name =sc.nextLine();
		System.out.println("Enter the Phone number :");
		
		long mob = sc.nextLong();
		System.out.println("Enter gender :");
		String Gender = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the email Id");
		String Email = sc.nextLine();
		System.out.println("Enter the Relashion :");
		String rel = sc.nextLine();
		
		
		s.setId(id);
		s.setName(name);
		s.setDob(rel);
		s.setEmail(Email);
		s.setGender(Gender);
		s.setMob(mob);
		s.setRelationship_status(rel);
		
		
		return s;
	

    }
	public static void giveStudentUpdate_dtails()
	{
		System.out.println("Enter gender :");
		String Gender = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the email Id");
		String Email = sc.nextLine();
		System.out.println("Enter the Relashion :");
		String rel = sc.nextLine();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to student portal....");
		Student_Controller controller = new Student_Controller();
		while(true)
		{
			System.out.println("1.Save Student");
			System.out.println("2.Find student by Id");
			System.out.println("3.Update student by Id");
			System.out.println("4.Delete Student by Id");
			System.out.println("6.Exit");
			
			System.out.println("Enter the choice");
			int Choice = sc.nextInt();
			switch(Choice)
			{
			case 1:
				Student student = getstudentobject();	
				Student s = controller.saveStudent(student);
				System.out.println(s);
					break;
				
			case 2:
				System.out.println("Enter student Id:");
				
				int id = sc.nextInt();
				Student s1 = controller.findStudentById(id);
				if(s1!=null)
				{
					System.out.println(s1);
				}
				else
				{
					System.out.println("Student not found....");
				}
					break;
				
			case 3:
				 System.out.println("Enter studend id");
				 int id2 = sc.nextInt();
				 boolean res = controller.update_studentById(id2);
				 
				 if(res==true)
				 {
					 System.out.println("updated...");
				 }
				 else
				 {
					 System.out.println("Record not found....");
				 }
				 break;
				
			case 4:
				  System.out.println("4. Delete student by Id");
				  int id3 = sc.nextInt();
				  boolean b = controller.deleteStudentById(id3);
				  
				  if(b==true)
				  {
					  System.out.println("Record deleted....");
				  }
				  else
				  {
					  System.out.println("Record not found....");
				  }
				  break;
				  
			case 5:
				  System.out.println("5. find all");
				  ArrayList<Student> st=controller.findall();
				  for(Student ss:st)
				  {
					  System.out.println(ss);
				  }
				  break;
			case 6:
				  System.out.println("Thank you");
				  return;
			case 7:
				  System.out.println("Invalid Choice");
				  break;
			}
		}
	     

}
}
