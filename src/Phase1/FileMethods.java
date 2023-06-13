package Phase1;
import java.util.*;

public class FileMethods {

	static Scanner sc = new Scanner(System.in);
	static TreeSet<String> directory = new TreeSet<>();
	
	FileMethods() {
		directory.clear();
		directory.add("File1.txt");
		directory.add("File2.txt");
	}
	
	public TreeSet<String> getDirectory() {
		return directory;
	}
	
	protected void addFile() {
		System.out.println("Enter the file that you want to add : ");
		String fname = sc.next();
		directory.add(fname);
	}
	
	protected void deleteFile() {
		System.out.println("Enter the file that you want to delete : ");
		String fname = sc.next();
		directory.remove(fname);
	}

	protected void searchFile() {
		System.out.println("Enter the file that you want to search for : ");
		String fname = sc.next();
		
		if(directory.contains(fname)) {
			System.out.println("File is present in the directory");
		} else {
			System.out.println("File is NOT present in the directory");
		}
		
	}
	
}
