package com.model1;

public class Student {
      
	
	   private int id;
	   private String name;
	   private long mob;
	   private String gender;
	   private String email;
	   private String dob;
	   private String relationship_status;
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getRelationship_status() {
		return relationship_status;
	}

	public void setRelationship_status(String relationship_status) {
		this.relationship_status = relationship_status;
	}
	
	public String toString()
	{
		return "Student[id="+id+",name ="+name+", mob="+mob+",gender = "+gender+", email="+email+", dob ="+dob+", relationship status ="+relationship_status +"]";
	}

}
