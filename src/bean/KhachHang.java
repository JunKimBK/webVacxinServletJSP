package bean;

import java.sql.Date;

public class KhachHang {
	private int MaKH;
	private String HoTenKH;
	private int SoDienThoaiKH;
	private String DiaChiKH;
	private Date NgaySinhKH;
	private String GioiTinhKH;
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public String getHoTenKH() {
		return HoTenKH;
	}
	public void setHoTenKH(String hoTenKH) {
		HoTenKH = hoTenKH;
	}
	public int getSoDienThoaiKH() {
		return SoDienThoaiKH;
	}
	public void setSoDienThoaiKH(int soDienThoaiKH) {
		SoDienThoaiKH = soDienThoaiKH;
	}
	public String getDiaChiKH() {
		return DiaChiKH;
	}
	public void setDiaChiKH(String diaChiKH) {
		DiaChiKH = diaChiKH;
	}
	public Date getNgaySinhKH() {
		return NgaySinhKH;
	}
	public void setNgaySinhKH(Date ngaySinhKH) {
		NgaySinhKH = ngaySinhKH;
	}
	public String getGioiTinhKH() {
		return GioiTinhKH;
	}
	public void setGioiTinhKH(String gioiTinhKH) {
		GioiTinhKH = gioiTinhKH;
	}
	public KhachHang(int maKH, String hoTenKH, int soDienThoaiKH, String diaChiKH, Date ngaySinhKH, String gioiTinhKH) {
		super();
		MaKH = maKH;
		HoTenKH = hoTenKH;
		SoDienThoaiKH = soDienThoaiKH;
		DiaChiKH = diaChiKH;
		NgaySinhKH = ngaySinhKH;
		GioiTinhKH = gioiTinhKH;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
