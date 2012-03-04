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
		String sql = "SELECT honv,tenlot,tennv,manv,cast(datepart(month,ngsinh) as varchar)+'/'+ cast(datepart(day,ngsinh) as varchar)+'/'+ cast(datepart(year,ngsinh) as varchar)as'Ngaysinh' ,dchi,phai,luong,ma_nql,phg FROM NHANVIEN";
		ResultSet rs = DataUtil.executeQuery(sql);
		while (rs.next()){
			NhanVienModel model = new NhanVienModel();
			model.setManv(rs.getString("MANV"));
			model.setHonv(rs.getString("HONV"));
			model.setTenlot(rs.getString("TENLOT"));
			model.setTennv(rs.getString("TENNV"));
			model.setNgsinh(rs.getString("Ngaysinh"));
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
public static NhanVienModel getNhanVienByID(String id){
	NhanVienModel model = null;
	try {
		String sql = "SELECT * FROM NHANVIEN WHERE MANV =?";
		PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			model = new NhanVienModel();
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
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return model;
}
public static ArrayList<NhanVienModel> searchNhanVien(String hoten,String phong,String diachi){
	ArrayList<NhanVienModel> listNhanVien = new ArrayList<NhanVienModel>();
	try {
		String sql = "SELECT honv,tenlot,tennv,manv,cast(datepart(month,ngsinh) as varchar)+'/'+ cast(datepart(day,ngsinh) as varchar)+'/'+ cast(datepart(year,ngsinh) as varchar)as'Ngaysinh' ,dchi,phai,luong,ma_nql,phg FROM NHANVIEN WHERE HONV+TENLOT+TENNV LIKE '%" +hoten+ "%' AND PHG LIKE '%" +phong+ "%' AND DCHI LIKE '%" +diachi+ "%'";
		ResultSet rs = DataUtil.executeQuery(sql);
		System.out.println("Result Set:"+rs.getRow());
		while (rs.next()){
			NhanVienModel model = new NhanVienModel();
			model.setManv(rs.getString("MANV"));
			model.setHonv(rs.getString("HONV"));
			model.setTenlot(rs.getString("TENLOT"));
			model.setTennv(rs.getString("TENNV"));
			model.setNgsinh(rs.getString("Ngaysinh"));
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
public static Boolean deleteNhanVien(NhanVienModel model){
	Boolean kq = false;
	try {
		String sql = "delete from NhanVien where manv = ?";
		PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
		ps.setString(1, model.getManv());
		ps.executeUpdate();
		kq = true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return kq;
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
public static Boolean insertNhanVien( NhanVienModel model){
	Boolean kq = false;
	String sql ;
		try {
			sql = "INSERT INTO NHANVIEN VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = DataUtil.getConnection().prepareStatement(sql);
			ps.setString(1, model.getHonv());
			ps.setString(2, model.getTenlot());
			ps.setString(3, model.getTennv());
			ps.setString(4, model.getManv());
			ps.setString(5, model.getNgsinh());
			ps.setString(6, model.getDiachi());
			ps.setString(7, model.getPhai());
			ps.setString(8, model.getLuong());
			ps.setString(9, model.getManql());
			ps.setString(10, model.getPhg());
			ps.executeUpdate();
			kq = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return kq;
}


}

