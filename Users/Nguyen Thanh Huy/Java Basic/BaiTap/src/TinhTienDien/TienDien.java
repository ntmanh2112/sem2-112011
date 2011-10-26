package TinhTienDien;

import java.util.Scanner;

public class TienDien {
	public static void main(String[] args) {
		int dienTieuThu;
		double thanhTien;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Nhap so dien nang tieu thu trong thang: ");
			dienTieuThu = scan.nextInt();
			//truong hop nhap so am
			if (dienTieuThu < 0) {
				System.out.println("So dien tieu thu phai so so nguyen duong ...!");
			}
			//cac truong hop con lai
			//...
		} while (dienTieuThu < 0);
		
		if (dienTieuThu < 100) {
			thanhTien = dienTieuThu * 550;
		}
		else if (dienTieuThu < 150) {
			thanhTien = dienTieuThu * 1200;
		}
		else {
			thanhTien = dienTieuThu * 1500;
		}
		
		System.out.println("So dien nang tieu thu trong thang: " + dienTieuThu + " Kwh");
		System.out.print(" ung voi so tien phai tra la: " + thanhTien);
	}

}
