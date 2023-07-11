package Phase1;

import java.util.*;

public class Menu extends Methods {

	static Scanner sc = new Scanner(System.in); 
	static boolean isEnding = false;
	
	public static void quit() {
		System.out.println("\n\t==== [PROGRAM TERMINATED] ====");
		isEnding = true;
	}
	
	public static void main(String[] args) {
				
		Methods meth = new Methods();
	
		DisplayMessage.welcomeScreen();
		
		while(!isEnding) {
			
			DisplayMessage.mainMenu();
			
			try {
				int ch = sc.nextInt();
				
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
					System.out.println("\t[INVALID INPUT]. Try again.");
					break;
				}
				
			} catch (Exception e) {
				System.out.println("\t[REQUIRE NUMERIC INPUT]. Try again.");
				sc.nextLine();
			}
				
		}
	}
}
