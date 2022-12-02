package java_35_Quan_ly_sach;

public class TacGia {
	private String tenTacGia;
	private NgaySinh ngaySinh;

	public TacGia(String tenTacGia, NgaySinh ngaySinh) {
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

}
