package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		FileWriter fw=null;
		String path="C:\\Users\\thota\\Documents\\Aptitude\\data.txt";
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		try {
			
			fw = new FileWriter(path,true);
			fw.write(s1);
			fw.write(s2);
			fw.write(s3);
			fw.flush();
			System.out.println("Successfully returned into file");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
