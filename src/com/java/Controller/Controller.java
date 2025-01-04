package com.java.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.java.Connecting.Connecting;
import com.java.Queries.Query;
import com.java.entities.Entity;

public class Controller {
	Scanner sc = new Scanner(System.in);

	Entity person = new Entity();
	Connecting c = new Connecting();

	private Connection con;

	public Controller(Connection con) {
		this.con = con;
	}
	
							//	Create
	public void create() {
		if(c.loadDriver() != null) {
			try {
				PreparedStatement pre = con.prepareStatement(Query.CREATE);
		
				System.out.println("Enter the ID : ");
				int id = sc.nextInt();
				System.out.println("Enter the Name : ");
				String Name = sc.next();
				System.out.println("Enter the Email Address :");
				String Email = sc.next();
				System.out.println("Enter the Course :");
				String Course = sc.next();
;				pre.setInt(1, id);
				pre.setString(2, Name);
				pre.setString(3, Email);
				pre.setString(4, Course);
				pre.execute();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}	
	                              //	Read
	public void read() {

		if(c.loadDriver() != null) {
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(Query.READ);

				while(rs.next()) {
					person.setID(rs.getInt("ID"));
					person.setNAME(rs.getNString("Name"));
					person.setEMAIL(rs.getNString("Email"));
					person.setCOURSE(rs.getNString("Course"));

					System.out.println(person);
				}


			} 
			catch (Exception e) {
				e.printStackTrace();
			}

		}
		else {
			System.out.println("Driver not yet loaded");
		}


	}
	                     // Update
	public void update() {
		if(c.loadDriver() != null) {
			try {
				PreparedStatement upr = con.prepareStatement(Query.UPDATE);
				System.out.println("Enter the Name to Update : ");
				String Name = sc.next();
				System.out.println("Enter the Email Address to Update:");
				String Email = sc.next();
				System.out.println("Enter the Course to Update :");
				String Course = sc.next();
				System.out.println("Enter the ID : ");
				int id = sc.nextInt();
				
				
				upr.setString(1, Name);
				upr.setString(2, Email);
				upr.setString(3, Course);
				upr.setInt(4, id);
			  Boolean msg = upr.execute();
			  if(msg = false) {
				  System.out.println("Data Updated to Database");
			  }
			 
			
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

						// Delete
	
	public void Delete() {
		if(c.loadDriver() != null) {
			try {
				PreparedStatement pst = con.prepareStatement(Query.DELETE);
				System.out.println("Enter the ID wants to Delete : ");
				int id = sc.nextInt();
				pst.setInt(1, id);
				boolean msg = pst.execute();
				if(msg == false) {
					System.out.println("ID Deleted Sucessfully");
				}
			
				
			} catch (Exception e) {
				System.out.println("There is no such ID");
			   
			}
		}
	}


}
