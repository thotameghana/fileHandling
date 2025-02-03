package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	public static void main(String[] args) {
		String path="C:\\Users\\thota\\Documents\\Aptitude\\data.txt";
		BufferedReader br=null;
		FileReader fr=null;
		try {
			fr=new FileReader(path);
			br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
