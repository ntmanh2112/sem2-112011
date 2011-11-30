package dao;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.BoldAction;

import util.DataUtil;

import model.ThanhVienModel;

public class ThanhVienDao {
	
	public static ThanhVienModel getThanhVien(String userName, String password) {
		ThanhVienModel model = null;
		
		try {
			String sql = "SELECT * FROM ThanhVien where Ten_Dang_Nhap='" + userName + "' and Mat_Khau='" + password +"'";
			ResultSet rs = DataUtil.executeQuery(sql);
			
			if(rs.next()) {
				model = new ThanhVienModel();
				model.setId(rs.getString("id"));
				model.setUserName(rs.getString("Ten_Dang_Nhap"));
				model.setPassword(rs.getString("Mat_Khau"));
				model.setRoles(rs.getString("Vai_Tro"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}

	public static ArrayList<ThanhVienModel> getallThanhVien() {
	ArrayList<ThanhVienModel> listThanhVien = new ArrayList<ThanhVienModel>();
	
	try {
		String sql = "SELECT * FROM THANHVIEN";
		ResultSet rs = DataUtil.executeQuery(sql);
		
		while(rs.next()) {
			ThanhVienModel model = new ThanhVienModel();
			
			model.setId(rs.getString("id"));
			model.setUserName(rs.getString("Ten_Dang_Nhap"));
			model.setPassword(rs.getString("Mat_Khau"));
			model.setRoles(rs.getString("Vai_Tro"));
			
			listThanhVien.add(model);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return listThanhVien;
}

	public static Boolean updateThanhVien(ThanhVienModel model) {
		
		Boolean kq = false;
		
		String sql = "update ThanhVien set Ten_Dang_Nhap = '" + model.getUserName() + "',Mat_Khau = '" + model.getPassword() + "',Vai_Tro =" + model.getRoles() +" where ID = " + model.getId() +"";
		kq = DataUtil.executeNonQuery(sql);

		return kq;
		
	}

public static Boolean deleteThanhVien(ThanhVienModel model) {
		
		Boolean kq = false;
		
		String sql = "delete ThanhVien where ID = " + model.getId() +"";
		kq = DataUtil.executeNonQuery(sql);

		return kq;
		
	}
}
