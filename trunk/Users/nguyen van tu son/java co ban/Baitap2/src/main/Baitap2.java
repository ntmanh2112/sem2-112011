package main;
import java.util.Scanner;


public class Baitap2 {
	
	public static void main (String[] args) {
		int dienTieuThu;

		Scanner dien = new Scanner(System.in);
		System.out.println("Nhap vao so dien tieu thu trong thang:");
		dienTieuThu = dien.nextInt();
	
	
		
		if(dienTieuThu <100) {
			System.out.println("So tien ban phai tra trong thang nay la:" +dienTieuThu*550);
		} else if(dienTieuThu >=100 && dienTieuThu <150) {
			System.out.println("So tien ban phai tra trong thang nay la:"+ dienTieuThu*1200);
		} else if(dienTieuThu >=150) {
			System.out.println("So tien ban phai tra trong thang nay la:"+ dienTieuThu*1500);
		}
		
	}
}
