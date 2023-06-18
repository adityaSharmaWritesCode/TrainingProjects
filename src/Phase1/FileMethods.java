package Phase1;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileMethods {

	static Scanner sc = new Scanner(System.in);
	static TreeSet<String> directory = new TreeSet<>();
	private String dirPath;
	
	FileMethods(String dirPath) {
		this.dirPath = dirPath;
		directory.clear();
		File dir = new File(dirPath); 
		if(!dir.exists()) {
			dir.mkdir();
		}
		for(String fName : dir.list()) {
			directory.add(fName);
		}
	}
	
	public TreeSet<String> getDirectory() {
		return directory;
	}
	
	protected void addFile(String fname) {
		
		// Ignoring case sensitivity : 
		
		for(String key : directory) {
			if(key.equalsIgnoreCase(fname)) {
				System.out.println("\n\tAnother file with same name exists! Try again");
				return;
			}
		}
		
		if(!directory.contains(fname)) {
			directory.add(fname);
			File obj = new File(dirPath + File.separator + fname);
			
			try {
				boolean isCreate = obj.createNewFile();
				if(isCreate) {
					System.out.println("\n\t" + fname + " added succesfully.");
				}
				else {
					System.out.println("\n\tFile could not be added.");
				}
			} catch (IOException e) {
				System.out.println("\n\tError occured while adding file : " + e.getMessage());
			}
		}
		else {
			System.out.println("\n\tFile already exists.");
		}
	}
	
	protected void deleteFile(String fname) {
		if(directory.contains(fname)) {
			directory.remove(fname);
			File obj = new File(dirPath + File.separator + fname);
			
			try {
				boolean isDelete = obj.delete();
				if(isDelete) {
					System.out.println("\n\t" + fname + " deleted succesfully.");
				}
				else {
					System.out.println("\n\tFile could not be deleted.");
				}
			} catch (Exception e) {
				System.out.println("\n\tError occured while deleting this file : " + e.getMessage());
			}
		} else {
			System.out.println("\n\tFile not found in the directory.");
		}
		
	}

	protected void searchFile(String fname) {
		if(directory.contains(fname)) {
			System.out.println("\n\tFile is present in the directory.");
		} else {
			System.out.println("\n\tFile not found in the directory.");
		}
		
	}
	
}
