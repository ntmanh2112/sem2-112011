package extend;

public class ConNguoi extends DongVat implements HanhDong, ChucNang {
//1. Thuoc tinh
	public String soDienThoai;
	public String email;
//2. Phuong thuc
	//constructor
	public ConNguoi() {
		this.ten = "Huy Rua";
		this.chieuCao = 1.65;
		this.canNang = 53;
		this.soDienThoai = "01688939550";
		this.email = "thanhhuynew@gmail.com";
		
		this.xuat();
	}
	//xuat thong tin
	public void xuat() {
		System.out.println("********** CON NGUOI **********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu cao: " + this.chieuCao);
		System.out.println("Can nang: " + this.canNang);
		System.out.println("So dien thoai: " + this.soDienThoai);
		System.out.println("Email: " + this.email);
	}
	@Override
	public void an() {
		System.out.println("An chin uong soi");
		
	}
	@Override
	public void ngu() {
		System.out.println("Ngu trong mung");	
	}

	@Override
	public void chay() {
		System.out.println("Chay bang 2 chan");
		
	}
	@Override
	public void hoc() {
		System.out.println("Di hoc de xoa mu chu");
		
	}
	@Override
	public void lapGiaDinh() {
		System.out.println("Lap Gia dinh de duy tri noi giong");
		
	}
	@Override
	public void duaXe() {
		System.out.println("Dua xe co ngay se bi sut moi");
		
	}

}
