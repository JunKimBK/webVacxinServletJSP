package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.ChiPhi;
import bean.VacXin;

public class ModelChiPhi {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	ModelConnectDb mcd = new ModelConnectDb();
	
	public ArrayList<ChiPhi> getList(){
		ArrayList< ChiPhi> alChiPhi = new ArrayList<>();
		String sql = "SELECT khachhang.MaKH, khachhang.HoTenKH, sum( vacxin.SoMui * vacxin.GiaVacXin ) AS ChiPhi FROM lichsutiemphong JOIN khachhang ON lichsutiemphong.MaKH = khachhang.MaKH JOIN vacxin ON lichsutiemphong.MaVacXin = vacxin.MaVacXin GROUP BY khachhang.MaKH, khachhang.HoTenKH ORDER BY ChiPhi ASC";
		con = mcd.getConnectSQL();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int maKH = rs.getInt("MaKH");
				String hoTenKH = rs.getString("HoTenKH");
				int chiPhi = rs.getInt("ChiPhi");
				ChiPhi cp = new ChiPhi(maKH, hoTenKH, chiPhi);
				alChiPhi.add(cp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return alChiPhi;
	}
	
}
