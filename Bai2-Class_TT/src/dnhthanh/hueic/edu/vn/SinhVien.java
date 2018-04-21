package dnhthanh.hueic.edu.vn;

public class SinhVien {
	public static int id = 0;
	private String hoten;
	private int tuoi;

	public SinhVien() {
		id++;
		this.hoten = "Default";
		this.tuoi = 0;
	}

	public SinhVien(String hoten, int tuoi) {
		id++;
		this.hoten = hoten;
		this.tuoi = tuoi;
	}
	
	public SinhVien(SinhVien s) {
		id++;
		this.hoten = s.hoten;
		this.tuoi = s.tuoi;
	}

	public String toString() {
		return "Ho ten: " + this.hoten + ", " + "Tuoi:" + this.tuoi + ", ID:"+id;
	}
}
