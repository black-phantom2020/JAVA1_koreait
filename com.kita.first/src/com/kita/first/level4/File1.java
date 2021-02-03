package com.kita.first.level4;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args)  {
		File file1 = new File("C:/JAVA_YJ/file_test/file1.txt");
		boolean isExist = file1.exists();
		
		if(isExist == false) {
			file1.mkdirs();
			try {
				file1.createNewFile();				
			} catch(IOException e) {
				
			} catch(Exception e) {
				
			}
		}
		
		String file1Path = file1.getPath();
		boolean result2 = file1.isDirectory();
		boolean result3 = file1.isFile();
	}
}








