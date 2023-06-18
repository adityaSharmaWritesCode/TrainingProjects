package Phase1;

public class DisplayMessage {
	
	static public void welcomeScreen () {
		System.out.println("\n\n\t====== LockedMe.com ======");
		System.out.println("\tDeveloper : Aditya Sharma");
	}
	
	static public void mainMenu() {
		System.out.println("\n\t====== Main Menu ======");
		System.out.println("\n\tOptions : ");
		System.out.println("\t1. View Directory");
		System.out.println("\t2. Edit Directory");
		System.out.print("\t3. Close Application\n\t");
	}
	
	static public void editMenu() {
		System.out.println("\n\t===== Edit Options =====");
		System.out.println("\t1. Add File");
		System.out.println("\t2. Delete File");
		System.out.println("\t3. Search File");
		System.out.print("\t4. Return to Main Menu\n\t");
	}
	
}
