package fantasy11230.gmail.com;

public class MainClass {

	public static void main(String[] args) {
		HinhKhoi hk = new HinhKhoi(1);
		HinhKhoi1 hk1 = new HinhKhoi1(3, 5);
		HinhKhoi2 hk2 = new HinhKhoi2(2, 4, 6);
		HinhKhoi3 hk3 = new HinhKhoi3(7, 9);
		System.out.println("Hình khối 1 có thể tích = "+hk1.thetich1());
		System.out.println("Hình khối 2 có thể tích = "+hk2.thetich2());
		System.out.println("Hình khối 3 có thể tích = "+hk3.thetich3());	
	}
}
