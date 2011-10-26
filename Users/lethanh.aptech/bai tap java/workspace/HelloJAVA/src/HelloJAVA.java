import java.util.Scanner;





public class HelloJAVA {
//protected no xai con no xai ,ai xai cung dc
//private minh no xai con no xai,ben ngoai ko xai dc
	//trong lop chua 2 thuoc tinh
	//1.thuoc tinh.
	//2.phuong thuc
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//khai bao bien
		String hoTen;
		int tuoi;//so thi ko de trong dau nhay
		int diemSo;
		
		//nhap lieu
		//lop doi tuong la phai dung tu khoa "new"
		Scanner scan = new Scanner(System.in);
		System.out.print("hay vui long nhap vao ho ten day du :");
		hoTen = scan.nextLine();
		System.out.print("hay vui long nhap vao tuoi chinh xac :");
		tuoi = scan.nextInt();
		System.out.print("hay vui long nhap vao diem trung binh hoc tap :");
		diemSo = scan.nextInt();
		
		//xuat du lieu
		System.out.println("xin chao " + hoTen + "\n Tuoi = " + tuoi);
		
		//cac bieu thuc dieu kien
		if(tuoi >= 18) {
			System.out.println("thanh nien");
		} else if (tuoi >= 13) {
			System.out.println ("Thieu Nien");
		} else {
			System.out.println("thieu nhi-nhi dong");
		}
		//trong switch phai co case
		switch (diemSo) {
		case 0:
			System.out.println("rot tot nghiep");
			break;
		case 5:
			System.out.println("tot nghiep-trung binh");
			break;	
		case 10:
			System.out.println("tot nghiep-xuat sac");
			break;	
		default:
			System.out.println("khong xet tot nghiep");
			break;
			
		}
		//vong lap
		for (int i=1 ; i <=4 ; i++) {
			System.out.println("hoc ki " + i);
		}
	}

}
