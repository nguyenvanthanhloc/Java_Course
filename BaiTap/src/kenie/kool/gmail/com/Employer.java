package kenie.kool.gmail.com;

import java.time.ZoneId;
import java.util.Date;

public class Employer {

	private String ma;
	private String hoten;
	private int namsinh;
	private boolean gioitinh;
	private float hsl;

	public float tinhLuong() {
		return 1250000 * hsl;
	}

	public int tinhTuoi() {
		return (new Date()).toInstant().atZone(ZoneId.systemDefault()).getYear() - namsinh;
	}

	@Override
	public String toString() {
		return "ID: " + ma + ", Họ Tên: " + hoten + ", Tuổi: " + tinhTuoi() + ", Giới tính: "
				+ ((gioitinh) ? "Nam" : "Nữ") + ", Lương: " + tinhLuong();
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public float getHsl() {
		return hsl;
	}

	public void setHsl(float hsl) {
		this.hsl = hsl;
	}

}
