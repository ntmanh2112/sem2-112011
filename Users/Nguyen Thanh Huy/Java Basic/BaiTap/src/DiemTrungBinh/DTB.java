package DiemTrungBinh;

import java.util.Scanner;

public class DTB {
	public static void main(String[] args) {
		String tenHS = "";
		float diemToan = 0;
		float diemVan = 0;
		float diemAV = 0;
		float diemTH = 0;
		float diemTB = 0;
		String xepLoai = "";
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Nhap ten hoc sinh: ");
			tenHS = scan.nextLine();
		} while (tenHS.isEmpty());
		
		do {
			System.out.print("Diem Toan: ");
			diemToan = scan.nextFloat();
		} while (diemToan < 0 || diemToan > 10);
		
		do {
			System.out.print("Diem Van: ");
			diemVan = scan.nextFloat();
		} while (diemVan < 0 || diemVan > 10);
		
		do {
			System.out.print("Diem Anh Van: ");
			diemAV = scan.nextFloat();
		} while (diemAV < 0 || diemAV > 10);
		
		do {
			System.out.print("Diem Tin Hoc: ");
			diemTH = scan.nextFloat();
		} while (diemTH < 0 || diemTH > 10);
		
		diemTB = ((diemToan + diemVan + diemAV) * 2 + diemTH)/7;
		
		if (diemTB < 5) {
			xepLoai = "Yeu";
		}
		else if (diemTB <= 6) {
			xepLoai = "Trung Binh";
		}
		else if (diemTB <= 7) {
			xepLoai = "Trung Binh Kha";
		}
		else if (diemTB <= 8) {
			xepLoai = "Kha";
		}
		else if (diemTB <= 9) {
			xepLoai = "Gioi";
		}
		else {
			xepLoai = "Xuat Sac";
		}
		
		System.out.print("Hoc sinh " + tenHS + " co diem trung binh la " + diemTB);
		System.out.println(" dat loai " + xepLoai);
	}

}
