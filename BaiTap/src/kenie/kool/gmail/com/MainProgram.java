package kenie.kool.gmail.com;

import java.util.ArrayList;

public class MainProgram {
	
	@SuppressWarnings("unchecked")
	public static void main(String[]args) {
	ArrayList<Student> st = new ArrayList();
	st.add(new Student("SV01","Tran Dai Quang",1997,true));
	st.add(new Student("SV02","Vladimir Putin",1996,false));
	st.add(new Student("SV03","God Rider",1998,true));
	st.add(new Student("SV04","Ni Su Say",1999,true));
	}
}
