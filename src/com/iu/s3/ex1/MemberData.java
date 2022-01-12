package com.iu.s3.ex1;

import java.util.Set;

public class MemberData {
	private String data;
	
	public MemberData() {
		this.data="id1-pw1-name1-id1@gmail.com-20-";
		this.data=this.data+"id2-pw2-name2-name2@naver.com-49-";
		this.data=this.data+"id3-pw3-name3-name3@daum.net-36-";
		this.data=this.data+"id4-pw4-name4-name4@daum.net-31-";

	}
		
		public MemberDTO[] init() {
			String []datas = this.data.split("-");
			MemberDTO[] members = new MemberDTO[4];
			int index = 0;
			for(int i=0;i<3;i++) {
			MemberDTO md = new MemberDTO();
			md.setEmail(datas[index]);
			md.setName(datas[++index]);
			md.setId(datas[++index]);
			md.setPw(datas[++index]);
			md.setAge(Integer.parseInt(datas[++index]));
			members[i]=md;
			index++;
			}
			return members;
		}
	public void a () {
		
		System.out.println(this.data.split("-"));
	}

}
