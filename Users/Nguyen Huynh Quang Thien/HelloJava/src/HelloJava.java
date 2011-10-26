import java.util.Scanner;



public class HelloJava {
	/*1.Thuộc tính
	 2.Phương thức
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Khai báo biến
		String hoTen;
			//chữ đầu tiên của biến phải viết thường
		int tuoi;
		int diem;
		
		//Nhập liệu
		Scanner scan = new Scanner(System.in);
			//gõ sca + ctrl spacebar :là nó tự import
			//lớp đối tượng scanner phải sử dụng new
		System.out.print("Bạn hãy nhập tên đầy đủ : ");
		hoTen = scan.nextLine();
			//nextLine là gán những gì nhập từ bàn phím vào 1 biến
		System.out.print("Bạn hãy nhập tuổi : ");
		tuoi = scan.nextInt();
		System.out.print("Bạn hãy nhập điểm trung bình : ");
		diem = scan.nextInt();
		
		//Xuất dữ liệu
		System.out.println("Hello " + hoTen + "\n tuoi = " + tuoi);
			//   \n là xuống dòng
		
		
		//Các biểu thức điều kiện
		if(tuoi >= 18 && tuoi < 35) {
			System.out.println("Thanh niên");
		} else if (tuoi >= 13){
			System.out.println("Thiếu niên");
		} else {
			System.out.println("Thiếu nhi");
		}
		
		switch (diem) {
			case 0:
				System.out.println("Rớt tốt nghiệp");
				break;
			case 5:
				System.out.println("Tốt nghiệp - trung bình");
				break;
			case 10:
				System.out.println("Tốt nghiệp - xuất sắc");
				break;
			default:
				System.out.println("Không xét tốt nghiệp");
				break;	
		}
		
		//vòng lập
		for (int i=0;i<= 4;i++) {
			System.out.println("Học kì " + i);
		}
	
	}

}
