package iti1121Exercise;

import java.io.File;

public class CountFilesWithStack {

	public static void main(String[] arg) {
		
		File f = new File("C:\\tempFolder\\Safia");
		System.out.println(countFiles(f));
	}

	
	public static int countFiles(File f) {
		int count = 0;

		f.isDirectory();// Returns a boolean if it is a directory
		f.listFiles();// Returns a File[] array with a list of files if it is a directory

		if (f.isDirectory()) {
			for (File dFile : f.listFiles()) {
				count += countFiles(dFile);
			}
			
//			Short form of doing the above loop to go through each file in listFiles() array
//			for(int i =0; i < f.listFiles().length; i++) {
//				File dFile = f.listFiles()[i];
//				
//			}
		} else
			count = 1;

		return count;

	}

}
