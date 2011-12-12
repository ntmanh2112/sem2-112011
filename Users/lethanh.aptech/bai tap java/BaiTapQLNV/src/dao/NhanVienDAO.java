package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DataUtil;

import model.NhanVienModel;

public class NhanVienDAO {
public static ArrayList<NhanVienModel> getAllNhanVien(){
	ArrayList<NhanVienModel> listNhanVien = new ArrayList<NhanVienModel>();
	try {
		String sql = "SELECT * FROM NHANVIEN";
		ResultSet rs = DataUtil.executeQuery(sql);
		while (rs.next()){
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
			listNhanVien.add(model);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return listNhanVien;
}
public static ArrayList<NhanVienModel> searchNhanVien(String hoten,String phong,String diachi){
	ArrayList<NhanVienModel> listNhanVien = new ArrayList<NhanVienModel>();
	try {
		String sql = "SELECT * FROM NHANVIEN WHERE HONV+TENLOT+TENNV LIKE '%" +hoten+ "%' AND PHG LIKE '%" +phong+ "%' AND DCHI LIKE '%" +diachi+ "%'";
		ResultSet rs = DataUtil.executeQuery(sql);
		System.out.println("Result Set:"+rs.getRow());
		while (rs.next()){
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
			listNhanVien.add(model);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return listNhanVien;
}
public static Boolean updateNhanVien( NhanVienModel model){
	Boolean kq = false;
	String sql = "Update NhanVien set HONV= '" + model.getHonv() 
										+ "',TENLOT='"+ model.getTenlot()
										+"', TENNV='"+model.getTennv()
										+"' , NGSINH='"+model.getNgsinh()
										+"', DCHI='"+model.getDiachi()
										+"' , PHAI='"+model.getPhai()
										+"' , LUONG="+model.getLuong()
										+" , MA_NQL='"+model.getManql()
										+"' , PHG='"+model.getPhg()
										+"' where MANV="+model.getManv();
	kq=DataUtil.executeNonQuery(sql);
	return kq;
}
public static boolean updateNhanVienNew(NhanVienModel model){
	Boolean kq = false;
	try {
		String sql = "update NhanVien set HONV=?,TENLOT=?, TENNV=? , NGSINH=?, DCHI=? , PHAI=? , LUONG=? , MA_NQL=? , PHG=? where MANV=?";
		PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
		ps.setString(1, model.getHonv());
		ps.setString(2, model.getTenlot());
		ps.setString(3, model.getTennv());
		ps.setString(4, model.getNgsinh());
		ps.setString(5, model.getDiachi());
		ps.setString(6, model.getPhai());
		ps.setString(7, model.getLuong());
		ps.setString(8, model.getManql());
		ps.setString(9, model.getPhg());
		ps.setString(10, model.getManv());
		ps.executeUpdate();
		kq = true;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return kq;
}
}

