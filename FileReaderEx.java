package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderEx {
	public static void main(String[] args) {
		String path="C:\\Users\\thota\\Documents\\Aptitude\\data.txt";
		char[] ar=new char[20];
		FileReader fr=null;
		try {
			fr=new FileReader(path);
			System.out.println(fr.read(ar));
			System.out.println(ar);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
