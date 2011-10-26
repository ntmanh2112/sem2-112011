import java.util.Scanner;


public class BaiTap2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dientieuThu;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap so ky dien trong thang");
		dientieuThu = scan.nextInt();
		
		if (dientieuThu < 100) {
			System.out.println("so tien phai tra la : " + dientieuThu * 550);
		}else if (dientieuThu < 150) {
			System.out.println("so tien phai tra la : " + dientieuThu *1200);
		}else {
			System.out.println("so tien phai tra la : " + dientieuThu *1500);
		}
		
	}

}
