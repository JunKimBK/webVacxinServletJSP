package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.KhachHang;
import bean.VacXin;

public class ModelKhachHang {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	ModelConnectDb mcd = new ModelConnectDb();
	
	public ArrayList<KhachHang> getList(){
		ArrayList< KhachHang> alkh = new ArrayList<>();
		String sql = "Select * from khachhang";
		con = mcd.getConnectSQL();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				//cai trong ngoac "" phai trung duoi database
				int maKH = rs.getInt("MaKH");
				String hoTenKH = rs.getString("HoTenKH");
				int soDienThoaiKH = rs.getInt("SoDienThoai");
				String diaChiKH = rs.getString("DiaChiKH");
				Date ngaySinhKH = rs.getDate("NgaySinh");
				String gioiTinhKH = rs.getString("GioiTinh");
				KhachHang kh = new KhachHang(maKH, hoTenKH, soDienThoaiKH, diaChiKH, ngaySinhKH, gioiTinhKH);
				
				alkh.add(kh);
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
		return alkh;
	}
	
}
