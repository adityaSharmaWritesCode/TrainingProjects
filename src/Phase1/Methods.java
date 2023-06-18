package Phase1;

import java.util.*;

public class Methods {

	static FileMethods f;
	
	Methods(){
		f = new FileMethods("C:\\Users\\Aditya Sharma\\Desktop\\Phase1-Project"); // root directory
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
		
		while(!endTask) {
			
			DisplayMessage.editMenu();
			
			try {
				ch = sc.nextInt();
				
				switch (ch) {
					case 1: {
						System.out.print("\tEnter the file that you want to add : ");
						String fname = sc.next();
						f.addFile(fname);
					}
						break;
					case 2: {
						System.out.print("\tEnter the file that you want to delete : ");
						String fname = sc.next();
						f.deleteFile(fname);
					}
						break;
					case 3: {
						System.out.print("\tEnter the file that you want to search for : ");
						String fname = sc.next();
						f.searchFile(fname);
					}
						break;
					case 4:
						endTask = true;
						break;
					default: {
						System.out.println("\t[INVALID INPUT] Try again.");
					}
						break;
				}
			} catch (Exception e) {
				System.out.println("\t[REQUIRE NUMERIC INPUT] Try again.");
				sc.nextLine();
			}
			
			
		}
	}
	
}
