package org.system;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud = new Students();
		stud.getStudentInfo(23);
		stud.getStudentInfo(23, "Priya");
		stud.getStudentInfo("acb@gmail.com", 9840789557l);

	}
	 public void getStudentInfo(int id) 
	 {
		 System.out.println("The student id is "+ id);
	 }
	 
	 public void getStudentInfo(int id,String name) 
	 {
		 System.out.println("The student "+ name+ "has id " + id);
	 }
	 
	 public void getStudentInfo(String email,Long phoneno ) 
	 {
		 System.out.println("The emailid is "+ email + " and phoneno is " + phoneno);
	 } 
	 

}
