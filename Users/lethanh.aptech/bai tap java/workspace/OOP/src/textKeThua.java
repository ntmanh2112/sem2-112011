import kethua.CaSau;
import kethua.ConMeo;
import kethua.ConNguoi;
import kethua.NhanVien;
import kethua.SinhVien;




public class textKeThua {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ConMeo cm = new ConMeo();
		cm.xuatThongTin();
		cm.an();
		cm.ngu();
		cm.chay();
		
		CaSau cs = new CaSau();
		cs.xuatThongTin();
		cs.chay();
		cs.an();
		cs.ngu();
		
		ConNguoi cn = new ConNguoi();
		cn.xuatThongTin();
		cn.an();
		cn.ngu();
		cn.chay();
		cn.hoc();
		cn.lapGiaDinh();
		cn.duaXe();
		
		SinhVien sv = new SinhVien();
		sv.xuatThongTin();
		sv.an();
		sv.ngu();
		sv.chay();
		sv.hoc();
		sv.lapGiaDinh();
		sv.duaXe();
		
		NhanVien nv = new NhanVien();
		nv.xuatThongTin();
		nv.an();
		nv.ngu();
		nv.chay();
		nv.hoc();
		nv.lapGiaDinh();
		nv.duaXe();

	}

}
