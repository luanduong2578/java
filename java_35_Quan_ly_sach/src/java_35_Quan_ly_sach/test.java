package java_35_Quan_ly_sach;

public class test {
	public static void main(String[] args) {
		NgaySinh ngaysinh1 = new NgaySinh(01, 02, 2022);
		NgaySinh ngaysinh2 = new NgaySinh(02, 03, 2022);
		NgaySinh ngaysinh3 = new NgaySinh(15, 05, 2015);
		
		TacGia tacGia1 = new TacGia("Dương Gia Thương", ngaysinh1);
		TacGia tacGia2 = new TacGia("Dương Gia Cung", ngaysinh2);
		TacGia tacGia3 = new TacGia("Dương tấn dương", ngaysinh3);
	}
}
