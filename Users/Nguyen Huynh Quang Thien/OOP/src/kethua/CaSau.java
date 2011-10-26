package kethua;

public class CaSau extends DongVat implements HanhDong {
	//1.Thuộc tính
	public String mauDa;
	
	//2.Phương thức
	public CaSau() {
		super.xuatThongtin();
		super.ten = "Cá sấu";
		super.chieuCao = 30;
		super.canNang = 200;
		this.mauDa = "màu xanh";
		
		//this.xuatThongTin();
	}
	
	public void xuatThongTin() {
		System.out.println("******************");
		System.out.println("Tên: " + this.ten);
		System.out.println("Chiều cao: " + this.chieuCao);
		System.out.println("Cân nặng : " + this.canNang);
		System.out.println("Màu da: " + this.mauDa);
	}
	
	@Override
	public void an() {
		System.out.println("Cá sấu ăn thịt người");
	}

	@Override
	public void chay() {
		System.out.println("Cá sấu bò hoặc bơi để di chuyển");
	}

	@Override
	public void ngu() {
		System.out.println("Cá sấu ngủ trên bờ");		
	}
	
}
