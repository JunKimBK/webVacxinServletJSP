package bean;

public class LichSuTiemPhong {
	private int MaKH;
	private String TenKH;
	private String TenBenh;
	private int MaVacXin;
	private String TenVacXin;
	private int SoMui;
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public String getTenKH() {
		return TenKH;
	}
	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}
	public String getTenBenh() {
		return TenBenh;
	}
	public void setTenBenh(String tenBenh) {
		TenBenh = tenBenh;
	}
	public int getMaVacXin() {
		return MaVacXin;
	}
	public void setMaVacXin(int maVacXin) {
		MaVacXin = maVacXin;
	}
	public String getTenVacXin() {
		return TenVacXin;
	}
	public void setTenVacXin(String tenVacXin) {
		TenVacXin = tenVacXin;
	}
	public int getSoMui() {
		return SoMui;
	}
	public void setSoMui(int soMui) {
		SoMui = soMui;
	}
	public LichSuTiemPhong(int maKH, String tenKH, String tenBenh, int maVacXin, String tenVacXin, int soMui) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		TenBenh = tenBenh;
		MaVacXin = maVacXin;
		TenVacXin = tenVacXin;
		SoMui = soMui;
	}
	public LichSuTiemPhong() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
