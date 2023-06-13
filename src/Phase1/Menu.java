package Phase1;

import java.util.*;

public class Menu extends Methods {

	static Scanner sc = new Scanner(System.in); 
	static boolean isEnding = false;
	
	public static void viewDirectory() {
		System.out.println("Option 1 selected");
	}
	
	public static void editDirectory() {
		System.out.println("Option 2 selected");
	}
	
	public static void quit() {
		System.out.println("Program Terminated");
		isEnding = true;
	}
	
	public static void main(String[] args) {
		
		int ch = 0;
		
		do {
		
			System.out.println("Application name and Developer Details\n");
			System.out.println("Options : ");
			System.out.println("1. View File Names in Ascending Order");
			System.out.println("2. Edit Directory");
			System.out.println("3. Close Application");
			
			ch = sc.nextInt();
			
			switch (ch) {
				case 1:
					viewDirectory();
					break;
				case 2:
					editDirectory();
					break;
				case 3:
					quit();
					break;
				default: 
				{
					System.out.println("Invalid Input. Try again : ");
					ch = sc.nextInt();
				}
					break;
			}
		}while(!isEnding);
		
	}

}
