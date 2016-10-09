package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.LichSuTiemPhong;
import bean.VacXin;

public class ModelLichSuTiemPhong {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	ModelConnectDb mcd = new ModelConnectDb();
	
	public ArrayList<LichSuTiemPhong> getList(int idKH){
		ArrayList< LichSuTiemPhong> alTiemPhong = new ArrayList<>();
		String sql = "SELECT lichsutiemphong.MaKH, lichsutiemphong.MaVacXin, khachhang.HoTenKH, vacxin.TenVacXin, vacxin.SoMui, benh.TenBenh FROM lichsutiemphong JOIN khachhang ON lichsutiemphong.MaKH = khachhang.MaKH JOIN vacxin ON lichsutiemphong.MaVacXin = vacxin.MaVacXin JOIN phongbenh ON vacxin.MaVacXin = phongbenh.MaVacXin JOIN benh ON phongbenh.MaBenh = benh.MaBenh WHERE lichsutiemphong.MaKH = ?";
		con = mcd.getConnectSQL();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, idKH);
			rs = ps.executeQuery();
			while(rs.next()){
				int maKH = rs.getInt("MaKH");
				String tenKH = rs.getString("HoTenKH");
				String tenBenh = rs.getString("TenBenh");
				int maVacXin = rs.getInt("MaVacXin");
				String tenVacXin = rs.getString("TenVacXin");
				int soMui = rs.getInt("SoMui");
				
				LichSuTiemPhong ls = new LichSuTiemPhong(maKH, tenKH, tenBenh, maVacXin, tenVacXin, soMui);
				alTiemPhong.add(ls);
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
		return alTiemPhong;
	}
}
