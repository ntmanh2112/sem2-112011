import java.util.Scanner;

 

//public: deu dung duoc het
//protected: dong ho cua java dung duoc, con dung duoc
//private: chi 1 minh no dung, con khong dung, dong ho  khong dung

public class HelloJAVA {
//1. Thuoc tinh
//2. Phuong thuc
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Khai bao bien
		String hoTen = ""; // chuoi trong dau nhay
		int tuoi; // so khong co dau nhay
		int diemSo;
		
		// Nhap lieu
		Scanner scan = new Scanner(System.in); // Lop Doi tuong thi phai su dung tu khoa NEW
		System.out.println("Hay vui long nhap vao ho va ten day du:");
		hoTen = scan.nextLine(); //nguoi dung nhap vao - gan vao bien hoTen
		System.out.println("Hay vui long nhap vao tuoi chinh xac:");
		tuoi = scan.nextInt();
		System.out.println("Hay vui long nhap vao diem so:");
		diemSo = scan.nextInt();
		
		
		
		// Xuat du lieu
		System.out.println("Xin chao"+ hoTen + "\n Tuoi = " +tuoi);
		
		// Cac bieu thuc dieu kien
		if(tuoi >= 18 && tuoi < 35) {
			System.out.println("Thanh nien");
		} else if (tuoi >= 13) {
			System.out.println("Thieu nien");
		}  else {
				System.out.println("Thieu nhi - Nhi dong");
			}
		
		// trong switch phai co case
		switch (diemSo) {
			case 0:
				System.out.print("Rot tot nghiep");
				break;
			case 5:
				System.out.print("Tot nghiep - Trung binh");
				break;
			case 10:
				System.out.print("Tot nghiep - Xuat sac");
				break;
			default:
				System.out.print("Khong xet tot nghiep");
				break;		
		}
		
		// vong lap
		for (int i = 1; i <= 4 ; i++) {
			System.out.println("Hoc ki" + i);
		}
	}
}
