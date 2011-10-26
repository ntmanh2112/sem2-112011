package thongtinsv;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
	//khai bao
	String hoTen;
	String diaChi;
	String dienThoai;
	String namSinh;
			
	Scanner s = new Scanner(System.in);
	
	//nhap thong tin
	public void nhapThongTin() {
		while (true) {
			System.out.println("Ho ten: ");
			hoTen = s.nextLine();
			if (hoTen.length() >= 10) {
				break;
			}
		}
		while (true) {
			System.out.println("Dia chi: ");
			diaChi = s.nextLine();
			if (!diaChi.isEmpty()) {
				break;
			}
		}
		while (true) {
			System.out.println("Dien thoai: ");
			dienThoai = s.nextLine();
			if (dienThoai.length() == 10 && laSo(dienThoai) == true) {
				break;
			}
		}
		while (true) {
			System.out.println("Nam sinh: ");
			namSinh = s.nextLine();
			if (laSo(namSinh) == true && tinhTuoi(namSinh) >= 18) {
				break;
			}
		}
	}
	//xuat thong tin
	public void xuatThongTin() {
		System.out.println("Sinh vien: " + hoTen);
		System.out.println("Dia chi: " + diaChi);
		System.out.println("So dien thoai: " + dienThoai);
		System.out.println("Nam sinh: " + namSinh);
	}
	//tinh tuoi
	public int tinhTuoi(String namSinh) {
		String namHT;
		int tuoi;
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(now);
		String[] d = date.split("/");
		
		namHT = d[2];
		tuoi = Integer.parseInt(namHT) - Integer.parseInt(namSinh);
		
		return tuoi;
	}
	//kiem tra so dien thoai
	public boolean laSo(String so) {
		boolean kt = true;
		for (int i = 0; i < so.length(); i++) {
			//System.out.println(a[i]);
			if (Character.isDigit(so.charAt(i)) == false) {
				kt = false;
			}
		}
		return kt;
	}
	public static void main (String[] args) {
		SinhVien sv = new SinhVien();
		//nhap lieu
		sv.nhapThongTin();
		sv.xuatThongTin();
		
		
				
	}
}
