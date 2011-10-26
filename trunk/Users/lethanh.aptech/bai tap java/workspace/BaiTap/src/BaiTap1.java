import java.util.Scanner;




public class BaiTap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTenHS;
		int diemToan;
		int diemVan;
		int diemAVan;
		int tinHoc;
		int diemTrungBinh;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap ho ten hoc sinh :");
		hoTenHS = scan.nextLine();
		System.out.println("nhap diem toan :");
		diemToan = scan.nextInt();
		System.out.println("nhap diem van :");
		diemVan = scan.nextInt();
		System.out.println("nhap diem Anh Van :");
		diemAVan = scan.nextInt();
		System.out.println("nhap diem tin hoc :");
		tinHoc = scan.nextInt();
		
		diemTrungBinh =  ((diemToan + diemVan + diemAVan) * 2 + tinHoc ) / 7;
		System.out.println("ho ten hoc sinh :" + hoTenHS + "\n diem toan :" + diemToan  + "\n diem van : " + diemVan + "\n diem anh van :" + diemAVan + "\n diem tin hoc :" + tinHoc + "\n diem trung binh :" + diemTrungBinh);
		
		if(diemTrungBinh < 5) {
			System.out.println("xep loai yeu");
		} else if (diemTrungBinh >= 5 && diemTrungBinh <=6) {
			System.out.println("xep loai trung binh");
		} else if (diemTrungBinh >= 6 && diemTrungBinh <=7) {
			System.out.println("Trung binh kha");
		} else if (diemTrungBinh >=7 && diemTrungBinh <=8) {
			System.out.println("xep loai kha");
		} else if (diemTrungBinh >= 8 && diemTrungBinh <=9) {
			System.out.println("xep loai gioi");
		} else if (diemTrungBinh >=9 && diemTrungBinh <=10) {
			System.out.println("xep loai xuat sac");
		}
		
		
	}

}
