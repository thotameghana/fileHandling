package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class NumberOfLineInFile {
	public static void main(String[] args) {
		String path="C:\\Users\\thota\\Documents\\Aptitude\\data.txt";
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(path);
			br=new BufferedReader(fr);
			String line;
			int count=0;
			while((line=br.readLine())!=null) {
				count++;
			}
			System.out.println("Number of line's are: "+count);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
