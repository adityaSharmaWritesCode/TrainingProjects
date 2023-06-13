package Phase1;

import java.util.*;

public class Methods {

	static FileMethods f;
	
	Methods(){
		f = new FileMethods();
	}
	
	public static void viewDirectory() {
		System.out.println("\nDirectory : ");
		for(String str : f.getDirectory()) {
			System.out.println("\t" + str);
		}
	}
	
	public static void editDirectory() {
		
		boolean endTask = false;
				
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		
		do {
			System.out.println("\nOptions : ");
			System.out.println("1. Add File");
			System.out.println("2. Delete File");
			System.out.println("3. Search File");
			System.out.println("4. Return to main menu");
			ch = sc.nextInt();
			
			switch (ch) {
				case 1:
					f.addFile();
					break;
				case 2:
					f.deleteFile();
					break;
				case 3:
					f.searchFile();
					break;
				case 4:
					endTask = true;
					break;
				default: 
				{
					System.out.println("Invalid Input. Try again : ");
					ch = sc.nextInt();
				}
					break;
			}
		} while(!endTask);
	}
	
	public static void clearConsole() {
		for(int i = 0; i < 25; i++)
			System.out.println("");
	}
	
}
