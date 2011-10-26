package kethua;

public class ConNguoi extends DongVat implements HanhDong, ChucNang{
	//1.thuoc tinh
	public String soDienThoai ;
	public String email ;
	//2.phuong thuc
	public ConNguoi() {
		super.ten = "Con Nguoi";
		super.chieuCao = 1700 ;
		super.canNang = 60 ;
		this.soDienThoai = "0938430200" ;
		this.email = "lethanh.aptech@gmail.com";
		//this.xuatThongTin();
		
		
	}
	public void xuatThongTin() {
		System.out.println("******** CON NGUOI ********" );
		System.out.println("ten: " + this.ten );
		System.out.println("Chieu Cao: " + this.chieuCao );
		System.out.println("Can Nang: " + this.canNang );
		System.out.println("So Dien Thoai: " + this.soDienThoai );
		System.out.println("Email: " + this.email );
	}
	@Override
	public void an() {
		// TODO Auto-generated method stub
		System.out.println("Nguoi an song , uong soi");
	}
	@Override
	public void chay() {
		// TODO Auto-generated method stub
		System.out.println("con nguoi chay xe MOTO");
	}
	@Override
	public void ngu() {
		// TODO Auto-generated method stub
		System.out.println("Con nguoi ngu may lanh");
	}
	@Override
	public void duaXe() {
		// TODO Auto-generated method stub
		System.out.println("con nguoi bi sut moi vi dua xe");
	}
	@Override
	public void hoc() {
		// TODO Auto-generated method stub
		System.out.println("con nguoi can phai hoc de gioi");
	}
	@Override
	public void lapGiaDinh() {
		// TODO Auto-generated method stub
		System.out.println("Con nguoi lap gia dinh de duy tri noi giong");
	}
	

}
