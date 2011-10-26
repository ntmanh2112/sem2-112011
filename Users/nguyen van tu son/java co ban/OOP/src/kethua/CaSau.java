package kethua;

public class CaSau extends DongVat implements HanhDong {
		// thuoc tinh
		public String mauDa;
		
		// phuong thuc
		public CaSau() {
			super.xuatThongTin();
			super.ten = "Ca Sau";
			super.chieuCao = 20;
			super.canNang = 300;
			this.mauDa = "Nau";
			
		}
		
		public void xuatThongTin() {
			System.out.println("********* CA SAU *********");
			System.out.println("Ten: " + this.ten);
			System.out.println("Chieu Cao: " + this.chieuCao);
			System.out.println("Can Nang: " + this.canNang);
			System.out.println("Can Nang: " + this.mauDa);
		}

		@Override
		public void an() {
			// TODO Auto-generated method stub
			System.out.println("Ca Sau an thit nguoi");
		}

		@Override
		public void chay() {
			// TODO Auto-generated method stub
			System.out.println("Ca sau bo 4 chan");
		}

		@Override
		public void ngu() {
			// TODO Auto-generated method stub
			System.out.println("Ca sau ngu tren bo va ha mieng");
		}
}
