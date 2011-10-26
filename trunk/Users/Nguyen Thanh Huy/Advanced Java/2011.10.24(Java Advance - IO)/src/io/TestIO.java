package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestIO {
	public static void main(String[] args) {
		while (true) {
			System.out.println("HAY CHON CHUC NANG TUONG UNG VOI CAC CONG VIEC DUOI DAY");
			System.out.println("1. DOC FILE BANG BufferReader");
			System.out.println("2. TRA KY TU ASSCII");
			System.out.println("3. DOC FILE BANG FileInputStream");
			int choise = 0;
			Scanner s = new Scanner(System.in);
			choise = s.nextInt();
			switch (choise) {
			case 1:
				readFileByUsingBufferReader();
				break;
			case 2: 
				convertCharacterToBinary();
				break;
			case 3: 
				readFileByUsingFileInputStream();
				break;
			default:
				break;
			}
			int choise2;
			System.out.println("BAN CO MUON TIEP TUC SU DUNG CHUONG TRINH KHONG ???  0 -> NO; ANY KEY -> YES");
			choise2 = s.nextInt();
			if (choise2 == 0) {
				System.out.println("Good byte!");
				break;
			}
		}
	}

	public static void readFileByUsingBufferReader() {
		System.out.println("********** DOC FILE BANG BufferReader **********");
		try {
			FileReader fr = new FileReader("D:/file.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] arr = line.split("-");
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i].trim());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("************************************************");
	}
	public static void convertCharacterToBinary() {
		System.out.println("********** TRA KY TU ASSCII **********");
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap vao ky tu can tim: ");
		String input = s.next();
		Character c = input.charAt(0);
		System.out.println("Ma ASSCII cua ky tu " + input + " la: " + new Integer(c));
		System.out.println("***************************************");
	}
	//DOC FILE BANG FileInputStream
	public static void readFileByUsingFileInputStream() {
		System.out.println("********** DOC FILE BANG FileInputStream **********");
		try {
			File f = new File("D:/file.txt");
			FileInputStream fis = new FileInputStream(f);
			
			StringBuffer strContent = new StringBuffer("");
			int ch = 0;
			while ((ch = fis.read()) != -1) {
				strContent.append((char) ch);
			}
			System.out.println(strContent);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("***************************************************");
	}
	
}
