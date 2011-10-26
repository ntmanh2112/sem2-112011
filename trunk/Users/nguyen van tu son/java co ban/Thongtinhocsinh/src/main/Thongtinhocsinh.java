package main;

import java.util.Scanner;

public class Thongtinhocsinh {
	public static void main(String[]args) {
		String hoTenHocSinh = "";
		String diaChi ="";
		int soDienThoai;
		int namSinh;
		
			
		Scanner nhap= new Scanner(System.in);
		while(true)
		{
			if(hoTenHocSinh.length()<=10)
			{
				System.out.print("Moi ban nhap Ho va Ten:");
				hoTenHocSinh = nhap.nextLine();
			}
			else
			{
				return;
			}
			
		}
	}
}
