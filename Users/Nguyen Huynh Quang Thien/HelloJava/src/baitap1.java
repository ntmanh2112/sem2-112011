import java.util.Scanner;


public class baitap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		int toan;
		int van;
		int anh;
		int tin;
		int avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ho ten hoc sinh : ");
		hoTen = scan.nextLine();
		System.out.println("Diem toan : ");
		toan = scan.nextInt();
		System.out.println("Diem van : ");
		van = scan.nextInt();
		System.out.println("Diem anh van : ");
		anh = scan.nextInt();
		System.out.println("Diem tin hoc : ");
		tin = scan.nextInt();
		
		avg = ((toan + van + anh)*2 + tin)/7;
		System.out.println("Diem trung binh : " + avg);
		
		if (avg < 5) {
			System.out.println("Hoc luc : Yeu");
		} else if (avg>=5 && avg<6) {
			System.out.println("Hoc luc : Trung binh");
		} else if (avg>=6 && avg<7) {
			System.out.println("Hoc luc : Trung binh kha");
		} else if (avg>=7 && avg<8) {
			System.out.println("Hoc luc : Kha");
		} else if (avg>=8 && avg<9) {
			System.out.println("Hoc luc : Gioi");
		} else if (avg>=9 && avg<=10) {
			System.out.println("Hoc luc : Xuat sac");
		}
	}

}
