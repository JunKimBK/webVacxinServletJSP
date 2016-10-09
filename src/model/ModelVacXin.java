package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.PreparedStatement;

import bean.VacXin;

public class ModelVacXin {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	ModelConnectDb mcd = new ModelConnectDb();
	
	public ArrayList<VacXin> getList(){
		ArrayList< VacXin> alVacXin = new ArrayList<>();
		String sql = "Select * from vacxin";
		con = mcd.getConnectSQL();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int maVacxin = rs.getInt("MaVacXin");
				String tenVacxin = rs.getString("TenVacXin");
				int somuiVacXin = rs.getInt("SoMui");
				String motaVacXin = rs.getString("MoTa");
				int giaVacxin = rs.getInt("GiaVacXin");
				String tenHang = rs.getString("TenHang");
				
				VacXin vx = new VacXin(maVacxin, tenVacxin, somuiVacXin, motaVacXin, giaVacxin, tenHang);
				alVacXin.add(vx);
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
		return alVacXin;
	}
	public int delVacXin(int vid){
		int result =0;
		String sql="DELETE FROM vacxin where MaVacXin =?";
		con = mcd.getConnectSQL();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, vid);
			ps.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
		
	}
	public VacXin getVacXin(int vid){
		VacXin vx = null;
		String sql ="SELECT * FROM vacxin where MaVacXin=?";
		con = mcd.getConnectSQL();
		try {
			ps= con.prepareStatement(sql);
			ps.setInt(1, vid);
			rs = ps.executeQuery();
			if(rs.next()){
				int maVacxin = rs.getInt("MaVacXin");
				String tenVacxin = rs.getString("TenVacXin");
				int somuiVacXin = rs.getInt("SoMui");
				String motaVacXin = rs.getString("MoTa");
				int giaVacxin = rs.getInt("GiaVacXin");
				String tenHang = rs.getString("TenHang");
				vx = new VacXin(maVacxin, tenVacxin, somuiVacXin, motaVacXin, giaVacxin, tenHang);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return vx;
	}
	//update vacxin sau khi sua
	public int updateVacxin(VacXin vx){
		int result = 0;
		String sql = "UPDATE vacxin set TenVacXin = ?, SoMui = ?, MoTa = ?, GiaVacXin = ?, TenHang = ? WHERE MaVacXin = ?";
		con = mcd.getConnectSQL();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, vx.getTenVacxin());
			ps.setInt(2, vx.getSomuiVacXin());
			ps.setString(3, vx.getMotaVacXin());
			ps.setInt(4, vx.getGiaVacxin());
			ps.setString(5, vx.getTenHang());
			ps.setInt(6, vx.getMaVacxin());
			ps.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int insertVacxin(VacXin vx){
		int result = 0;
		String sql = "INSERT INTO vacxin(TenVacXin, SoMui, MoTa, GiaVacXin, TenHang) VALUES(?,?,?,?,?)";
		con = mcd.getConnectSQL();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, vx.getTenVacxin());
			ps.setInt(2, vx.getSomuiVacXin());
			ps.setString(3, vx.getMotaVacXin());
			ps.setInt(4, vx.getGiaVacxin());
			ps.setString(5, vx.getTenHang());
			ps.executeUpdate();
			result = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	
}
