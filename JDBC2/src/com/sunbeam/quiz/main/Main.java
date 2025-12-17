package com.sunbeam.quiz.main;
import java.util.Scanner;

import com.sunbeam.quiz.menu.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Menu.menu(sc);
		sc.close();
	}

}
