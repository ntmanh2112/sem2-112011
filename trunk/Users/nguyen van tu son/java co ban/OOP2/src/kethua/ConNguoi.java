package kethua;

public class ConNguoi extends DongVat implements HanhDong, ChucNang {
	public String soDienThoai;
	public String email;
	
	public ConNguoi() {
		this.ten = "Con Nguoi";
		this.chieuCao = 170;
		this.canNang = 50;
		this.soDienThoai = "0909090909";
		this.email = "tsnguyenvan@gmail.com";
	}
	
	public void xuatThongTin() {
		System.out.println("********* CON NGUOI *********");
		System.out.println("Ten:" + this.ten);
		System.out.println("Chieu Cao:" + this.chieuCao);
		System.out.println("Can Nang:" + this.canNang);		
		System.out.println("So Dien Thoai:" + this.soDienThoai);
		System.out.println("Email:" + this.email);
		
	}

	@Override
	public void an() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguo an chin, uong soi");
	}

	@Override
	public void chay() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi chay xe tay ga");
	}

	@Override
	public void ngu() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi ngu trong may lanh");
	}

	@Override
	public void duaXe() {
		// TODO Auto-generated method stub
		System.out.println("Cong Nguoi du xe bi te");
	}

	@Override
	public void hoc() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguo hoc de co tri thuc");
	}

	@Override
	public void lapGiaDinh() {
		// TODO Auto-generated method stub
		System.out.println("Con Nguoi lap gia dinh duy tri noi giong");
	}
}
