/*
 * Bai 1: Cho file Employee.txt có cấu trúc sau:
 * Viết chương trình đọc FILE trên, sau đó display tất cả kết quả đọc được lên màn hình.
 */
package bai1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Bai1 {
	public static void main(String[] args) {
		readDataFromFile();
	}
	public static void readDataFromFile() {
		Scanner s = new Scanner(System.in);
		String fileName;
		FileReader fr;
		BufferedReader br;
		
		System.out.println("Nhap file can doc: ");
		fileName = s.nextLine();
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
