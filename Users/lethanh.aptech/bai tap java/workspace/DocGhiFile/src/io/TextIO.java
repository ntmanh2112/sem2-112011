package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readFileUsingFileInputStream();
	}
	public static void readFile() {

		try {
			FileReader fr = new FileReader("D:/data.txt");//dung de doc file
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			
			while ((line = br.readLine()) != null ) {
				String[] a = line.split("-");
				for (int i = 0; i < a.length; i++){
				System.out.println(a[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void readFileUsingFileInputStream() {
		
		try {
			File file = new File("D:/data.txt");
			FileInputStream fin = new FileInputStream(file);
			
			StringBuffer strContent = new StringBuffer("");
			int ch;
			while ((ch = fin.read()) != -1) {
				strContent.append((char) ch);
				System.out.print(strContent);
				//return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
