package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TestIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readFileUsingFileInputStream();
		writeTextFile();
		System.out.println("Ghi file thanh cong");
	}
	
	public static void printAsscii() {
		System.out.println("Nhap vao ki tu bat ki tren ban phim  :");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		Character c = input.charAt(0);
		
		System.out.println("Ma ASSCI cua " + c + " la :" + new Integer(c));
	}
	
	public static void readFile() {
		try {
			FileReader fr = new FileReader("D:/data.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] a = line.split("-");
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeTextFile() {
		try {
			FileWriter fw = new FileWriter("D:/DataOutput.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Hello Aptech\nSemester II");
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void readFileUsingFileInputStream() {
		try {
			File file = new File("D:/Music/NangCoConXuan.mp3");
			FileInputStream fin = new FileInputStream(file);
			
			//StringBuffer strContent = new StringBuffer("");
			int ch;
			int stt = 0;
			while ((ch =  fin.read()) != -1) {
				//strContent.append((char) ch);
				System.out.println(ch);
				stt++;
				if (stt == 2)
					return;
			}
			//System.out.println(strContent);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
