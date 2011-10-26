import java.util.Scanner;


public class baitap3 {

	/**
	 * Cho tọa độ của 1 tam giác. Tính chu vi,diện tích. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//khai báo biến
		double P=0,S=0;
		double A,B,C;
		double p;//nửa chu vi
		int xA,yA,xB,yB,xC,yC;
		
		//input
		while (true) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Mời bạn nhập tọa độ điểm A: ");
		System.out.println("Tọa độ Xa: ");
		xA = sc.nextInt();
		System.out.println("Tọa độ Ya: ");
		yA = sc.nextInt();
		
		System.out.println("Mời bạn nhập tọa độ điểm B: ");
		System.out.println("Tọa độ Xb: ");
		xB = sc.nextInt();
		System.out.println("Tọa độ Yb: ");
		yB = sc.nextInt();
		
		System.out.println("Mời bạn nhập tọa độ điểm C: ");
		System.out.println("Tọa độ Xc: ");
		xC= sc.nextInt();
		System.out.println("Tọa độ Yc: ");
		yC = sc.nextInt();
		
		//xử lí:
		/*if(xA == xB && xB == xC && xC == xA) {
			System.out.println("Không là tam giác vì 'có 3 điểm x trùng nhau' ");
		} else if (yA == yB && yB == yC && yC == yA) {
			System.out.println("Không là tam giác vì 'có 3 điểm y trùng nhau' ");
		}else if (xA == xB && yA == yB || xB == xC && yB == yC || xC == xA && yC == yA) {
			System.out.println("Không là tam giác vì 'có 2 điểm trùng nhau' ");
		}*/

		
		//tính khoảng cách
		A = Math.sqrt(Math.pow((xB-xC),2) + Math.pow((yB-yC),2));
		B = Math.sqrt(Math.pow((xA-xC),2) + Math.pow((yA-yC),2));
		C = Math.sqrt(Math.pow((xB-xA),2) + Math.pow((yB-yA),2));
		
		//tinh chu vi,diện tích
		boolean kiemTra = kiemTraTamGiac(A,B,C);
		
		if(kiemTra == true) {
			p = A + B + C;
			P = p/2;
			S = Math.sqrt(p*(p-A)*(p-B)*(p-C));
			
			//xuất dữ liệu
			System.out.println("Chu vi tam giac là : " + P);
			System.out.println("Diện tích tam giac là : " + S);
			
			break;
		} else {
			System.out.println("Không là tam giác");
		}
	}
		
		
	}


	public static boolean kiemTraTamGiac(double A, double B,double C) {
		boolean kq = true;
		
		if ((A+B<=C) || (A+C<=B) || (B+C)<=A) {
			kq = true;
		}
		return kq;	
	}
}