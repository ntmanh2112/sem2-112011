package kethua;

public class ConMeo extends DongVat implements HanhDong {
	// thuoc tinh
	public String mauLong;
	
	// phuong thuc
	public ConMeo() {
		super.xuatThongTin();
		super.ten = "Con Meo";
		super.chieuCao = 30;
		super.canNang = 3;
		this.mauLong = "Trang";
	}
	
	public void xuatThongTin() {
		System.out.println("********* CON MEO *********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu Cao: " + this.chieuCao);
		System.out.println("Can Nang: " + this.canNang);
		System.out.println("Can Nang: " + this.mauLong);
		
	}

	@Override
	public void an() {
		// TODO Auto-generated method stub
		System.out.println("Meo an chuot");
	}

	@Override
	public void chay() {
		// TODO Auto-generated method stub
		System.out.println("Meo chay 4 chan");
	}

	@Override
	public void ngu() {
		// TODO Auto-generated method stub
		System.out.println("Meo ngu trong beps");
	}
}
