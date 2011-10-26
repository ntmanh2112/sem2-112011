package sinhvien;

import java.util.Scanner;

public class SinhVien {
//1. Thuoc tinh
	public String hoTen;
	public String diaChi;
	public String dienThoai;
	public String namSinh;
//2. Phuong thuc
	//constructor
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	//nhap
	public void nhap() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ho ten: ");
		this.hoTen = s.nextLine();
		System.out.println("Dia chi: ");
		this.diaChi = s.nextLine();
		System.out.println("Dien thoai: ");
		this.dienThoai = s.nextLine();
	}
	//xuat
	public void xuat() {
		System.out.println("Sinh vien: " + hoTen);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("Dien thoai: " + dienThoai);
	}
//cac phuong thuc phu (validate)
	//kiem tra ho ten
	public boolean vHoTen(String ht) {
		boolean kq = true;
		if (ht.length() < 10) {
			kq = false;
		}
		return kq;
	}
	//validate dia chi
	public boolean vDiaChi(String dc) {
		boolean kq = true;
		if (dc.trim().isEmpty()) {
			kq = false;
		}
		return kq;
	}
	//validate so dien thoai
	public boolean vDienThoai(String sdt) {
		boolean kq = true;
		if (sdt.length() != 10) {
			kq = false;
		}
		else {
			for (int i = 0; i < sdt.length(); i++) {
				if (!Character.isDigit(sdt.charAt(i))) {
					kq = false;
				}
			}
		}
		return kq;
	}
	//validate tuoi
	public boolean vTuoi() {
		boolean kq = true;
		
		return kq;
	}
}
