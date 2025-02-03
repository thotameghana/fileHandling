package com.FileHandling;
import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		File file=new File("C:\\tap completion modules");
		System.out.println(file.exists());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] a=file.list();
		System.out.println("file's list");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		File f=new File("C:\\tap completion modules\\bbb.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.delete());
		
		
	}
}