package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class TestIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFileUsingFileInputStream();
	}

	public static void readFile(){
		try {
			FileReader fr= new FileReader("C:/phongdu/test.txt");
			BufferedReader br= new BufferedReader(fr);
			String line="";
			try {
				while ((line = br.readLine()) != null)
				{
					String[] a = line.split("-");
					
					for(int i =0 ; i<a.length; i ++)
					{
						System.out.println(a[i]);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void printAsscii() {
		System.out.println("Nhap vao ki tu bat ki tren ban phim");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		Character c = input.charAt(0);
		
		System.out.println("Ma ASSCI cua "+ c + " la :" + new Integer(c));
		
	}
	public static void readFileUsingFileInputStream() {
		try {
			File file = new File("C:/phongdu/test.txt");
			FileInputStream fin = new FileInputStream(file);
	
			StringBuffer strContent = new StringBuffer("");
			int ch;
			
			try {
				while ((ch = fin.read()) != -1)
				{
					strContent.append((char) ch);
				}
				System.out.println(strContent);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
