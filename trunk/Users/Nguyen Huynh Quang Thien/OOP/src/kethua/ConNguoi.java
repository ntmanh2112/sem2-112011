package kethua;

public class ConNguoi extends DongVat implements HanhDong,ChucNang {
	//1.Thuộc tính
	public String soDienThoai;
	public String email;
	
	//2.Phương thức
	public ConNguoi() {
		super.xuatThongtin();
		super.ten = "Con người";
		super.chieuCao = 1700;
		super.canNang = 60;
		this.soDienThoai = "123456789";
		this.email = "quangthien@gmail.com";
		
		//this.xuatThongTin();
	}
	
	public void xuatThongTin() {
		System.out.println("******************");
		System.out.println("Tên: " + this.ten);
		System.out.println("Chiều cao: " + this.chieuCao);
		System.out.println("Cân nặng : " + this.canNang);
		System.out.println("số điện thoại: " + this.soDienThoai);
		System.out.println("Email: " + this.email);
	}

	@Override
	public void an() {
		System.out.println("Người ăn chín,uống sôi");
	}

	@Override
	public void chay() {
		System.out.println("Người chạy tay ga");
	}

	@Override
	public void ngu() {
		System.out.println("Người ngủ máy lạnh");		
	}

	@Override
	public void duaXe() {
		System.out.println("Người đua xe sức môi");
		
	}

	@Override
	public void hoc() {
		System.out.println("Người học để sống");
		
	}

	@Override
	public void lapGiaDinh() {
		System.out.println("Người lập gia đình để xướng");
		
	}
}
