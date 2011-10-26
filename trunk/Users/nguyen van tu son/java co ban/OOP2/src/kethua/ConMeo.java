package kethua;

public class ConMeo extends DongVat implements HanhDong {
	public String mauLong;
	
	public ConMeo() {
		this.ten = "Con Meo";
		this.chieuCao = 20;
		this.canNang = 3;
		this.mauLong = "Trang";
	}
	
	public void xuatThongTin() {
		System.out.println("********* CON MEO *********");
		System.out.println("Ten:" + this.ten);
		System.out.println("Chieu Cao:" + this.chieuCao);
		System.out.println("Can Nang:" + this.canNang);		
		System.out.println("Mau Long:" + this.mauLong);
	}

	@Override
	public void an() {
		// TODO Auto-generated method stub
		System.out.println("Con Meo an ca");
	}

	@Override
	public void chay() {
		// TODO Auto-generated method stub
		System.out.println("Con Meo chay 4 chan");
	}

	@Override
	public void ngu() {
		// TODO Auto-generated method stub
		System.out.println("Con Meo ngu duoi bep");
	}
}
