import java.util.Scanner;


public class ThongTinSinhVien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//khai bao bien
		String hoTenSV;
		String diaChi;
		int dienThoai;
		int namSinh;
		double hT =10;
		
		double dT =10;
		double nS =1995;
		//nhap lieu
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap ho ten Sinh Vien :");
		hoTenSV = scan.nextLine();
		System.out.println("nhap dia chi :");
		diaChi = scan.nextLine();
		System.out.println("nhap so dien thoai cua sinh vien :");
		dienThoai = scan.nextInt();
		System.out.println("nhap nam sinh cua Sinh Vien :");
		namSinh = scan.nextInt();
		
		boolean kiemTra = kiemTraThongTin (hT,dT,nS);
		if (kiemTra = true) {
		//xuat du lieu
		System.out.println("Ho Ten Sinh Vien :" + hoTenSV + "\n Dia Chi :" + diaChi + "\n So Dien Thoai :" + dienThoai + "\n Nam Sinh :" + namSinh);
		break;
		}else  {
			System.out.println("ho ten phai tren 10 ky tu");
			System.out.println("so dien thoai phai tren 10 so");
			System.out.println("ban chua du 18 tuoi");
		} 
		}
		}
		
	public static boolean kiemTraThongTin (double hT, double dT, double nS) {
		boolean kq = true;
		if ((hT <10)||(dT <10)||(nS<1995)){
			kq = false;
		}
		return kq;
	}
}
