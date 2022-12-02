package java_35_Quan_ly_sach;

public class Sach {
	private String tenSach;
	private TacGia tenTacGia;
	private int namXuatBan;
	private double giaBan;

	public Sach(String tenSach, TacGia tenTacGia, int namXuatBan, double giaBan) {
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.namXuatBan = namXuatBan;
		this.giaBan = giaBan;
	}
	public void inTenSach() {
		 System.out.println("Ten sach: "+ this.tenSach);
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public TacGia getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(TacGia tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	
	
	

}
