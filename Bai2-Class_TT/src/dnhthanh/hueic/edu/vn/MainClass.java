package dnhthanh.hueic.edu.vn;

public class MainClass {

	public static void main(String[] args) {
		SinhVien sv = new SinhVien("Nam", 21);
		System.out.println(sv.toString());
		SinhVien s = new SinhVien(sv);
		System.out.println(s.toString());
		//System.out.println(SinhVien.id);
	}

}
