package kethua;

public class CaSau extends DongVat implements HanhDong{
	//1.thuoc tinh
	public String mauDa ;
	//2.phuong thuc
	public CaSau() {
		super.ten = "Ca Sau";
		super.chieuCao = 20 ;
		super.canNang = 80 ;
		this.mauDa = "nau";
		
		//this.xuatThongTin();
		
		
	}
	public void xuatThongTin() {
		System.out.println("******** CA SAU ********" );
		System.out.println("ten: " + this.ten );
		System.out.println("Chieu Cao: " + this.chieuCao );
		System.out.println("Can Nang: " + this.canNang );
		System.out.println("Mau Da: " + this.mauDa );
		
	}
	@Override
	public void an() {
		// TODO Auto-generated method stub
		System.out.println("Ca Sau An thit nguoi");
	}
	@Override
	public void chay() {
		// TODO Auto-generated method stub
		System.out.println("Ca Sau bo hoac boi de di chuyen");
	}
	@Override
	public void ngu() {
		// TODO Auto-generated method stub
		System.out.println("Ca Sau ngu tren bo va ha mieng");
	}
}