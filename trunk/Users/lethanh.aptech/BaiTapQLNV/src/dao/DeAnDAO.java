package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DataUtil;

import model.DeAnModel;

public class DeAnDAO {
	public static ArrayList<DeAnModel>getAll() {
		ArrayList<DeAnModel>listDeAn = new ArrayList<DeAnModel>();
		try {
			String sql = "SELECT * FROM DEAN";
			ResultSet rs = DataUtil.executeQuery(sql);
			while(rs.next()) {
				DeAnModel  model = new DeAnModel();
				model.setTENDA(rs.getString("TENDA"));
				model.setMADA(rs.getString("MADA"));
				model.setDDIEM_DA(rs.getString("DDIEM_DA"));
				model.setPHONG(rs.getString("PHONG"));
				listDeAn.add(model);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listDeAn;
	}
}