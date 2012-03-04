package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DataUtil;

import model.PhongBanModel;

public class PhongBanDAO {
	public static ArrayList<PhongBanModel>getAll() {
		ArrayList<PhongBanModel>listPhongBan = new ArrayList<PhongBanModel>();
		try {
			String sql = "SELECT * FROM PHONGBAN";
			ResultSet rs = DataUtil.executeQuery(sql);
			while(rs.next()) {
				PhongBanModel  model = new PhongBanModel();
				model.setTenPHG(rs.getString("TENPHG"));
				model.setMaPHG(rs.getString("MAPHG"));
				model.setTruongPHG(rs.getString("TRPHG"));
				model.setNgayNhanChuc(rs.getString("NG_NHANCHUC"));
				listPhongBan.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listPhongBan;
	}
}
