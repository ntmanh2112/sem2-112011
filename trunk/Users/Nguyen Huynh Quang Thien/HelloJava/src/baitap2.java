import java.util.Scanner;


public class baitap2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kw;
		int kq;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bạn nhập lượng điện tiêu thụ : ");
		kw = scan.nextInt();
		
		if (kw < 100) {
			kq = kw * 550;
			System.out.println("Tiền điện tháng này là : " + kq);
		} else if (kw < 150 ) {
			kq = kw * 1200;
			System.out.println("Tiền điện tháng này là : " + kq);
		} else if (kw >=  150) {
			kq = kw * 1500;
			System.out.println("Tiền điện tháng này là : " + kq);
		}
		
	}

}
