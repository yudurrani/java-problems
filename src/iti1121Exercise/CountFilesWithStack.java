package iti1121Exercise;

import java.io.File;
import java.util.Iterator;
import java.util.Stack;

public class CountFilesWithStack {

	public static void main(String[] arg) {

		File f = new File("C:\\tempFolder\\Safia");
		System.out.println(countFiles(f));
	}

	public static int countFilesUsingStack(File f) {
		Stack<File> stack = new Stack<File>();
		int count = 0;

		stack.push(f);
		while (stack.empty() != true) {
			File file = stack.pop();
			if (file.isDirectory()) {
				// add all files in the directory to the stack.
				for (int i = 0; i < file.listFiles().length; i++) {
					File dFile = file.listFiles()[i];
					stack.push(dFile);
					
				}

			} else
				count++;

		}
		return count;

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
