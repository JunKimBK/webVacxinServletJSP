package bean;

public class ChiPhi {
	private int MaKH;
	private String HoTenKH;
	private int ChiPhi;
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
	public int getChiPhi() {
		return ChiPhi;
	}
	public void setChiPhi(int chiPhi) {
		ChiPhi = chiPhi;
	}
	public ChiPhi(int maKH, String hoTenKH, int chiPhi) {
		super();
		MaKH = maKH;
		HoTenKH = hoTenKH;
		ChiPhi = chiPhi;
	}
	public ChiPhi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
