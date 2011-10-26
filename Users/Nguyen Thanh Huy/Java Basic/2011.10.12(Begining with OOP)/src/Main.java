import tamgiac.TamGiac;




public class Main {
	public static void main(String[] args) {
		TamGiac tg = new TamGiac();
		tg.nhap();
		double chuVi = tg.tinhChuVi();
		double dienTich = tg.tinhDienTich();
		System.out.println("Dien tich: " + dienTich);
		System.out.println("Chu vi: " + chuVi);
	}

}
