package com.iu.s3.ex1.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.iu.s3.ex1.member.MemberDTO;
import com.iu.s3.ex1.member.MemberData;

public class StudentData {
	private Scanner sc;

	public Map<String, StudentDTO> addStudent(List<MemberDTO> al) {
		this.sc = new Scanner(System.in);
		// 키보드로부터 member의 수만큼 성적 정보 입력
		// 이정보들을 StudentDTO
		// map의 키는 id
		HashMap<String, StudentDTO> hm = new HashMap<>();

		for (int i = 0; i < al.size(); i++) {
			StudentDTO sd = new StudentDTO();
			sd.setName(al.get(i).getName());
			sd.setId(al.get(i).getId());
			System.out.println(al.get(i).getName() + "의 국어 성적을 입력하세요");
			sd.setKor(sc.nextInt());
			System.out.println(al.get(i).getName() + "의 영어 성적을 입력하세요");
			sd.setEng(sc.nextInt());
			System.out.println(al.get(i).getName() + "의 수학 성적을 입력하세요");
			sd.setMath(sc.nextInt());
			sd.setTotal(sd.getKor() + sd.getEng() + sd.getMath());
			sd.setAvg(sd.getTotal() / 3.0);
			hm.put(al.get(i).getId(), sd);
		}

		return hm;
	}

}
