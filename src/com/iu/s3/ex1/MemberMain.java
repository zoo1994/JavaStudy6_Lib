package com.iu.s3.ex1;

import java.util.ArrayList;



public class MemberMain {

	public static void main(String[] args) {
		//test, 프로그램 실행

		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> ar = memberData.ini();
		memberData.removeMember(ar);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getId());
			System.out.println(ar.get(i).getPw());
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getEmail());
			System.out.println(ar.get(i).getAge());
		}
	
	}
	
	
}

