package extend;

public class ConMeo extends DongVat implements HanhDong {
//1. Thuoc tinh
	public String mauLong;
//2. Phuong thuc
	//constructor
	public ConMeo() {
		super.ten = "Tom";
		super.chieuCao = 0.35;
		super.canNang = 3.5;	
		/*
		 * hoac co the dung this.ten = "Tom".
		 * Nhung thuoc tinh nay thuoc ve lop cha, nen de the hien tinh minh bach thi nen dung super
		 * 
		 * */
		this.mauLong = "Nau";
	}
	//xuat
	public void xuat() {
		System.out.println("********** CON MEO **********");
		System.out.println("Ten: " + this.ten);
		System.out.println("Chieu cao: " + this.chieuCao);
		System.out.println("Can nang: " + this.canNang);
		System.out.println("Mau long: " + this.mauLong);
	}
	@Override
	public void an() {
		System.out.println("Con meo thich an ca song.");
		
	}
	@Override
	public void ngu() {
		System.out.print("Con meo hay an vung nen thuong ngu trong bep.");
		
	}
	@Override
	public void chay() {
		System.out.print("Con meo chay bang 4 chan.");
		
	}

}
