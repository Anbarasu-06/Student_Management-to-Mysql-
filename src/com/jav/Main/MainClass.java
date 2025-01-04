package com.jav.Main;


import java.sql.Connection;
import java.util.Scanner;

import com.jav.Connecting.Connecting;
import com.jav.Controller.Controller;

public class MainClass {

	public static void main(String[] args) {

		Connecting con = new Connecting();
		Connection connect = con.loadDriver();

		Controller cont = new Controller(connect);
		Scanner sc = new Scanner(System.in);


		System.out.println("       Student Management     ");
		System.out.println("------------------------------");
		System.out.println("1. Create");
		System.out.println("2. Read");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		System.out.println(" ");
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			cont.create();
			break;
		}
		case 2: {

			cont.read();
			break;
		}
		case 3: {

			cont.update();;
			break;
		}
		case 4:{

			cont.Delete();
			break;
		}
		
			
		

		}

	}
}






