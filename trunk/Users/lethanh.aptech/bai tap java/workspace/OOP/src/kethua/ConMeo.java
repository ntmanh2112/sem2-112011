package kethua;

public class ConMeo extends DongVat implements HanhDong {
	//1.thuoc tinh
	public String mauLong ;
	//2.phuong thuc
	public ConMeo() {
		super.xuatThongTin();
		super.ten = "Con Meo";
		super.chieuCao = 30 ;
		super.canNang = 3 ;
		this.mauLong = "trang";
		
		//this.xuatThongTin();
		
		
	}
	public void xuatThongTin() {
		System.out.println("******** CON MEO ********" );
		System.out.println("ten: " + this.ten );
		System.out.println("Chieu Cao: " + this.chieuCao );
		System.out.println("Can Nang: " + this.canNang );
		System.out.println("Mau Long: " + this.mauLong );
		
	}
	@Override
	public void an() {
		System.out.println("Meo an chuot");
		
	}
	@Override
	public void chay() {
		
		System.out.println("Meo chay 4 chan");
	}
	@Override
	public void ngu() {
		
		System.out.println("Meo ngu trong bep");
	}
}
