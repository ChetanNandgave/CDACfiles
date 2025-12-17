package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class Menu {
	Scanner sc=new Scanner(System.in);
	
	private static int menuOptions(Scanner sc) {
	
		System.out.println("0.Exit");
		System.out.println("1.Display Students");
		System.out.println("2.Add Student");
		System.out.println("3.Update Student");
		System.out.println("4.Delete Student");
		System.out.println();
		System.out.println("Enter the choice:");
		return sc.nextInt();
	}
	
	public static void menu(Scanner sc) {
		int choice;
		
		while((choice=menuOptions(sc))!=0) {
	
		switch(choice) {
		case 1:
			//getAllStudent();
			break;
		case 2:
			//addStudents(sc);
			break;
		case 3:
			//updateStudent(sc);
			break;
		case 4:
			//deleteStudent(sc);
			break;
		default:
			//System.out.println("Wrong Choice");
		}
		}
}}
