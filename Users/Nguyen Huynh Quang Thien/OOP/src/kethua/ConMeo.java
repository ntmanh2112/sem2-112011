package kethua;

public class ConMeo extends DongVat implements HanhDong {
	//1.Thuộc tính
	public String mauLong;
	
	//2.Phương thức
	public ConMeo() {
		super.xuatThongtin();
		super.ten = "Con mèo";
		super.chieuCao = 30;
		super.canNang = 2;
		this.mauLong = "màu vàng";
		
		//this.xuatThongTin();
	}
	
	public void xuatThongTin() {
		System.out.println("******************");
		System.out.println("Tên: " + this.ten);
		System.out.println("Chiều cao: " + this.chieuCao);
		System.out.println("Cân nặng : " + this.canNang);
		System.out.println("Màu lông: " + this.mauLong);
	}
	
	@Override
	public void an() {
		System.out.println("Mèo bắt chuột");
	}

	@Override
	public void chay() {
		System.out.println("Mèo chạy bằng 4 chân");
	}

	@Override
	public void ngu() {
		System.out.println("Mèo ngủ trong bếp");		
	}
}
