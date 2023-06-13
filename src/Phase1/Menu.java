package Phase1;

import java.util.*;

public class Menu extends Methods {

	static Scanner sc = new Scanner(System.in); 
	static boolean isEnding = false;
	
	public static void quit() {
		System.out.println("\tProgram Terminated");
		isEnding = true;
	}
	
	public static void main(String[] args) {
		
		int ch = 0;
		
		Methods meth = new Methods();
		
		WelcomeScreen.display();
		
		do {
			
			System.out.println("\n\t*** Main Menu ***");
			System.out.println("\n\tOptions : ");
			System.out.println("\t1. View Files");
			System.out.println("\t2. Update Directory");
			System.out.print("\t3. Close Application\n\t");
			
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
					System.out.println("\t[INVALID INPUT] Try again.");
					break;
			}
		}while(!isEnding);
		
	}

}
