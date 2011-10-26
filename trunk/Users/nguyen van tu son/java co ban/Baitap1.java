package main;
import java.util.Scanner;


public class Baitap1 {

	public static void main(String[] args) {
		String hoTenHocSinh ="";
		int diemToan;
		int diemVan;
		int diemAnhVan;
		int diemTinHoc;
		int diemTrungBinh;
		
		Scanner nhap= new Scanner (System.in);
		System.out.println("Vui long nhap ho va ten:");
		hoTenHocSinh = nhap.nextLine();
		System.out.println("Vui long nhap diem Toan:");
		diemToan = nhap.nextInt();
		System.out.println("Vui long nhap diem Van:");
		diemVan = nhap.nextInt();
		System.out.println("Vui long nhap diem Anh Van:");
		diemAnhVan = nhap.nextInt();
		System.out.println("Vui long nhap diem Tin Hoc:");
		diemTinHoc = nhap.nextInt();
	
		 diemTrungBinh = ((diemToan + diemVan + diemAnhVan)*2 +diemTinHoc)/7;
		
		
		System.out.println("Ho va ten hoc sinh:"+ hoTenHocSinh + "\n Diem Toan :" + diemToan + "\n Diem Van :"
				+ diemVan + "\n Diem Anh Van :" + diemAnhVan + "\n Diem Tin Hoc :" + diemTinHoc
				+ "\n Diem Trung Binh :" + diemTrungBinh);
		
		if (diemTrungBinh <5) {
			System.out.println(" Hoc luc Yeu");
		} else if (diemTrungBinh >= 5 && diemTrungBinh <=6 ) {
			System.out.println("Hoc luc Trung Binh");
		} else if (diemTrungBinh >=6 && diemTrungBinh <= 7) {
			System.out.println("Hoc luc Trung Binh Kha");
		} else if (diemTrungBinh >= 7  && diemTrungBinh <=8) {
			System.out.println("Hoc luc Kha");
		} else if (diemTrungBinh >= 8 && diemTrungBinh <=9) {
			System.out.println("Hoc luc Gioi");
		} else if (diemTrungBinh >=9 && diemTrungBinh <= 10) {
			System.out.println("Xuat sac");
		}
	}
}
