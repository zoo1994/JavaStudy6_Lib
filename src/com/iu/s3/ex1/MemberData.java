package com.iu.s3.ex1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class MemberData {
	private String data;
	private Scanner sc;
	public MemberData() {
		this.sc = new Scanner (System.in);
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
	public ArrayList<MemberDTO> ini(){
		//data에 있는 문자열을 StringTokenizer로 파싱해서
		//MemberDTO를 생성해서 멤버변수값에 대입
		//MemberDTO들을 ArrayList에 담아서 리턴
		ArrayList<MemberDTO>ar = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(this.data,"-");
		while(st.hasMoreTokens()) {
			MemberDTO md = new MemberDTO();
			md.setId(st.nextToken().trim());	
			md.setPw(st.nextToken().trim());
			md.setName(st.nextToken().trim());
			md.setEmail(st.nextToken().trim());
			md.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(md);
		}
		
		return ar;
	}
	
	public void addMember(ArrayList<MemberDTO>ar) {
		//새로추가할 MemberDTO생성
		//키보드로부터 id,pw,name,email,age 입력받음
		//MemberDTO의 멤버변수값으로 대입
		//매개변수로 받은 ar에 MemberDTO추가
		MemberDTO md = new MemberDTO();
		System.out.println("추가할 id를 입력하세요");
		md.setId(sc.next());
		System.out.println("추가할 pw를 입력하세요");
		md.setPw(sc.next());
		System.out.println("추가할 이름을 입력하세요");
		md.setName(sc.next());
		System.out.println("추가할 이메일을 입력하세요");
		md.setEmail(sc.next());
		System.out.println("추가할 나이를 입력하세요");
		md.setAge(sc.nextInt());
		ar.add(md);
		
	}
	
	public MemberDTO removeMember(ArrayList<MemberDTO>ar) {
		MemberDTO memberDTO = null;
		System.out.println("삭제할 멤버의 id를 입력하세요");
		String ri = sc.next();
		for(int i = 0; i<ar.size();i++) {
			if(ar.get(i).getId().equals(ri)) {
				memberDTO = ar.remove(i);
				break;
			}		
		}
		
		
		return memberDTO;
	}
	
}
