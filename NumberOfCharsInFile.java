package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class NumberOfCharsInFile {
	public static void main(String[] args) {
		String path="C:\\Users\\thota\\Documents\\Aptitude\\data.txt";
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(path);
			br=new BufferedReader(fr);
			String line;
			int noOfChars=0;
			while((line=br.readLine())!=null) {
				noOfChars+=line.length();
			}
			System.out.println("Number of character's are "+noOfChars);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
