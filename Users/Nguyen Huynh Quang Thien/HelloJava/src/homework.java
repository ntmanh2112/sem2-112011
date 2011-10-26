import java.util.Scanner;


public class homework {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Khai báo biến
		String hoTen;
		String diaChi;
		String dienThoai;
		int namSinh;
		
		//input
		while (true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mời bạn nhập họ tên : ");
		hoTen = sc.nextLine();
		System.out.println("Mời bạn nhập địa chỉ : ");
		diaChi = sc.nextLine();
		System.out.println("Mời bạn nhập số điện thoại : ");
		dienThoai = sc.nextLine();
		System.out.println("Mời bạn nhập năm sinh : ");
		namSinh = sc.nextInt();
		
		//Xuất dữ liệu
		boolean test = kiemTra(hoTen,diaChi,dienThoai,namSinh);
		
		if(test == true) {
			System.out.println("Họ tên sinh viên : " + hoTen);
			System.out.println("Địa chỉ : " + diaChi);
			System.out.println("Số điện thoại : " + dienThoai);
			System.out.println("Năm sinh : " + namSinh);
			
			break;
		}
		}
	}
	public static boolean kiemTra(String hoTen,String diaChi,String dienThoai,int namSinh) {
		boolean kq = true;
		if(hoTen.length() < 10 || diaChi.length() < 10 || dienThoai.length() < 10 || 2011 - namSinh < 18) {
			kq = true;
		}
		return kq;
	}
}
