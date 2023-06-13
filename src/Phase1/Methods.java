package Phase1;

import java.util.*;

public class Methods {

	static FileMethods f;
	
	Methods(){
		f = new FileMethods();
	}
	
	public static void viewDirectory() {
		TreeSet<String> d = f.getDirectory();
		
		if(d.size() == 0) { // Empty Directory exception handling
			System.out.println("\n\t(Empty Directory)\n");
		}
		else {
			System.out.println("\n\tDirectory : ");
			for(String str : d) {
				System.out.println("\t\t" + str);
			}
		}
	}
	
	public static void editDirectory() {
		
		boolean endTask = false;
				
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		
		do {
			System.out.println("\n\tDirectory Options : ");
			System.out.println("\t1. Add File");
			System.out.println("\t2. Delete File");
			System.out.println("\t3. Search File");
			System.out.print("\t4. Return to main menu\n\t");
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
					System.out.println("\t[INVALID INPUT] Try again.");
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
