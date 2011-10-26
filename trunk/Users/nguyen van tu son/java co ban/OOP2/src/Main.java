import kethua.CaSau;
import kethua.ConMeo;
import kethua.ConNguoi;
import kethua.DongVat;
import kethua.NhanVien;
import kethua.SinhVien;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DongVat dv = new DongVat();
		 dv.xuatThongTin();
		 
		 ConMeo cm = new ConMeo();
		 cm.xuatThongTin();
		 cm.chay();
		 cm.an();
		 cm.ngu();
		 
		 CaSau cs = new CaSau();
		 cs.xuatThongTin();
		 cs.chay();
		 cs.an();
		 cs.ngu();
		 
		 ConNguoi cn = new ConNguoi();
		 cn.xuatThongTin();
		 cn.chay();
		 cn.an();
		 cn.ngu();
		 cn.hoc();
		 cn.lapGiaDinh();
		 cn.duaXe();
		 
		 NhanVien nv = new NhanVien();
		 nv.xuatThongTin();
		 nv.chay();
		 nv.an();
		 nv.ngu();
		 nv.hoc();
		 nv.lapGiaDinh();
		 nv.duaXe();
		 
		 SinhVien sv = new SinhVien();
		 sv.xuatThongTin();
		 sv.chay();
		 sv.an();
		 sv.ngu();
		 sv.hoc();
		 sv.lapGiaDinh();
		 sv.duaXe();
		 
	}

}
