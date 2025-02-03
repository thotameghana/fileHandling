package com.FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
public class ReadFromOneWriteToAnother {
	public static void main(String[] args) {
		String path1="C:\\Users\\thota\\Documents\\Aptitude\\data.txt";
		String path2="C:\\Users\\thota\\Documents\\Aptitude\\newData.txt";
		
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader(path1);
			fw=new FileWriter(path2);
			int c=fr.read();
			while(c!=-1) {
				fw.write(c);
				c=fr.read();
			}
			fw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
