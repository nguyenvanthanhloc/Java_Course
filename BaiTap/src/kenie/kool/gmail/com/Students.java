package kenie.kool.gmail.com;

import java.util.ArrayList;

public class Students implements ISearch {

	private ArrayList<Student> Students = new ArrayList<Student>();

	@Override
	public Object timKiem(int form, int to) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object timKiem(boolean gioitinh) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object timKiem(String ten) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Student> getStudetns(){
		return Students;
	}
	public void setStudents(ArrayList<Student> Students) {
		this.Students = Students;
	}
}
