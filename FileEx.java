package com.FileHandling;

import java.io.File;
import java.io.IOException;
public class FileEx {
	public static void main(String[] args) {
		String path="C:\\Users\\thota\\Documents\\Aptitude";
		File f=new File(path);
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		
		System.out.println(f.getName());
		
		System.out.println(f.getParent());
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getAbsoluteFile());
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
//		System.out.println(f.mkdir());
		
//		String[] myFiles = f.list();
//		for(String l:myFiles) {
//			System.out.println(l);
//		}
		try {
		System.out.println(f.createNewFile());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		f.delete();
	}
}
