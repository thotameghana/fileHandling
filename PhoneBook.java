package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class PhoneBook {
	public static void main(String[] args) {
		String path1="C:\\Users\\thota\\Documents\\Aptitude\\Names.txt";
		String path2="C:\\Users\\thota\\Documents\\Aptitude\\PhoneNumbers.txt";
		String path3="C:\\Users\\thota\\Documents\\Aptitude\\PhoneBook.txt";
		FileReader fr1=null;
		BufferedReader br1=null;
		
		FileReader fr2 = null;
		BufferedReader br2= null;
		
		FileWriter fw=null;
		
		try {
			fr1=new FileReader(path1);
			br1=new BufferedReader(fr1);
			
			fr2=new FileReader(path2);
			br2=new BufferedReader(fr2);
			
			fw=new FileWriter(path3);
			
			String name,phoneNumber;
			while((name=br1.readLine())!=null && (phoneNumber=br2.readLine())!=null) {
				System.out.println(name+" : "+phoneNumber);
				fw.write(name+" : "+phoneNumber+"\n");
			}
			fw.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
