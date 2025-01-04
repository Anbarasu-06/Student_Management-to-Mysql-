package com.java.Queries;

public class Query {
	
	public final static String CREATE = "INSERT into student_table (ID,Name,Email,Course) values (?,?,?,?)";
	public final static String READ = "SELECT * FROM student_table";
	public final static String UPDATE = "UPDATE Student_table SET Name=?,Email=?,Course=? WHERE ID=?";
	public final static String DELETE = "DELETE FROM Student_table WHERE ID=?";
	

}
