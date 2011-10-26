package extend;

public class CaSau extends DongVat implements HanhDong {
//1. Thuoc tinh
	public String mauDa;
//2. Phuong thuc
	//constructor
	public CaSau() {
		super.ten = "Bao Luc";
		super.chieuCao = 4.5;
		super.canNang = 300;
		this.mauDa = "Xam";
	}
	//xuat
	public void xuat() {
		System.out.println("********** CA SAU **********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu cao: " + this.chieuCao);
		System.out.println("Can nang: " + this.canNang);
		System.out.println("Mau da: " + this.mauDa);
	}
	@Override
	public void an() {
		System.out.println("Ca sau la dong vat rat nguy hiem, no co the an thit nguoi.");
		
	}
	@Override
	public void ngu() {
		System.out.println("Khi ngu ca sau thuong ha mieng");
		
	}
	@Override
	public void chay() {
		System.out.println("Ca sau bo bang bon chan");
		
	}
	
	
}
