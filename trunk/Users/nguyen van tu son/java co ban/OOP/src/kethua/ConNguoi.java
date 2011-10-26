package kethua;

public class ConNguoi extends DongVat implements HanhDong, ChucNang{
	
	// thuoc tinh
	public String soDienThoai;
	public String email;
	
	// phuong thuc
	public ConNguoi() {
		super.xuatThongTin();
		super.ten = "Con Nguoi";
		super.chieuCao = 170;
		super.canNang = 60;
		this.soDienThoai = "0909090909";
		this.email = "tsnguyenvan@gmail.com";
		
		
	}
	
	public void xuatThongTin() {
		System.out.println("********* CON NGUOI *********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu Cao: " + this.chieuCao);
		System.out.println("Can Nang: " + this.canNang);
		System.out.println("So Dien Thoai: " + this.soDienThoai);
		System.out.println("Email: " + this.email);	
	}

	@Override
	public void an() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi an chin uong soi");
	}

	@Override
	public void chay() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi chay 2 chan");
	}

	@Override
	public void ngu() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi ngu trong mung");
	}

	@Override
	public void duaXe() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi dua xe bi sut moi");
	}

	@Override
	public void hoc() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi can phai hoc de co tri thuc");
	}

	@Override
	public void lapGiaDinh() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi lap gia dinh de duy tri noi dong");
	}
}
