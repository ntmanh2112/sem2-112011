package dao;

import java.io.Writer;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import util.DataUtil;

import model.NhanVienModel;
import model.PhanCongModel;

public class PhanCongDAO {
	public static ArrayList<PhanCongModel> getAll() {
		ArrayList<PhanCongModel>listPhanCong = new ArrayList<PhanCongModel>();
		try {
			String sql = "SELECT * FROM PHANCONG";
			ResultSet rs = DataUtil.executeQuery(sql);
			while(rs.next()) {
				PhanCongModel  model = new PhanCongModel();
				model.setMA_NVIEN(rs.getString("MA_NVIEN"));
				model.setSODA(rs.getString("SODA"));
				model.setTHOIGIAN(rs.getString("THOIGIAN"));
				listPhanCong.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listPhanCong;
	}
	public static ArrayList<NhanVienModel> timnhanviendaphancong(String madean){
		ArrayList<NhanVienModel>listPhanCongphai = new ArrayList<NhanVienModel>();
			
		try {
			CallableStatement cs = DataUtil.getConnection().prepareCall("{call SP_TIMKIEMNHANVIENTHEODEAN(?)}");
			cs.setString("MADEAN", madean);
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				
				NhanVienModel model = new NhanVienModel();
				model.setManv(rs.getString("MANV"));
				model.setHonv(rs.getString("HONV"));
				model.setTenlot(rs.getString("TENLOT"));
				model.setTennv(rs.getString("TENNV"));
				model.setNgsinh(rs.getString("NGSINH"));
				model.setDiachi(rs.getString("DCHI"));
				model.setPhai(rs.getString("PHAI"));
				model.setLuong(rs.getString("LUONG"));
				model.setManql(rs.getString("MA_NQL"));
				model.setPhg(rs.getString("PHG"));
				listPhanCongphai.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listPhanCongphai;
	}
	public static ArrayList<NhanVienModel> timnhanvienchuaphancong(String madean){
		ArrayList<NhanVienModel>listPhanCongtrai = new ArrayList<NhanVienModel>();
			
		try {
			CallableStatement cs = DataUtil.getConnection().prepareCall("{call SP_TIMKIEMNHANVIENKHONGTHEODEAN(?)}");
			cs.setString("MADEAN", madean);
			ResultSet rs = cs.executeQuery();
			while(rs.next()){
				
				NhanVienModel model = new NhanVienModel();
				model.setManv(rs.getString("MANV"));
				model.setHonv(rs.getString("HONV"));
				model.setTenlot(rs.getString("TENLOT"));
				model.setTennv(rs.getString("TENNV"));
				model.setNgsinh(rs.getString("NGSINH"));
				model.setDiachi(rs.getString("DCHI"));
				model.setPhai(rs.getString("PHAI"));
				model.setLuong(rs.getString("LUONG"));
				model.setManql(rs.getString("MA_NQL"));
				model.setPhg(rs.getString("PHG"));
				listPhanCongtrai.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listPhanCongtrai;
	}
	
	public static Boolean insertPhanCong( PhanCongModel model){
		Boolean kq = false;
		String sql ;
			try {
				sql = "INSERT INTO PHANCONG VALUES (?,?,?)";
				PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
				ps.setString(1, model.getMA_NVIEN());
				ps.setString(2, model.getSODA());
				ps.setString(3, model.getTHOIGIAN());
				
				ps.executeUpdate();
				kq = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return kq;	
}
}