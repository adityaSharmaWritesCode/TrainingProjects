package Phase1;
import java.util.*;

public class FileMethods {

	static Scanner sc = new Scanner(System.in);
	static TreeSet<String> directory = new TreeSet<>();
	
	FileMethods() {
		directory.clear();
	}
	
	public TreeSet<String> getDirectory() {
		return directory;
	}
	
	protected void addFile() {
		System.out.print("\tEnter the file that you want to add : ");
		String fname = sc.next();
		directory.add(fname);
		System.out.println("\tFile added succesfully!!");
	}
	
	protected void deleteFile() {
		System.out.print("\tEnter the file that you want to delete : ");
		String fname = sc.next();
		
		if(directory.contains(fname)) {
			directory.remove(fname);
			System.out.println("\tFile deleted succesfully!!");
		} else {
			System.out.println("\tFile is not present in the directory.");
		}
		
	}

	protected void searchFile() {
		System.out.print("\tEnter the file that you want to search for : ");
		String fname = sc.next();
		
		if(directory.contains(fname)) {
			System.out.println("\tFile is present in the directory.");
		} else {
			System.out.println("\tFile is NOT present in the directory.");
		}
		
	}
	
}
