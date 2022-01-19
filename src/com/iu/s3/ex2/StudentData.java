package com.iu.s3.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;



public class StudentData {
	
	
	
	private String info;
	private Scanner sc;
	
	public StudentData() {
		this.sc=new Scanner(System.in);
		this.info = "name,1,15,50,60,";
		this.info = this.info+"name2,2,52,68,40,";
		this.info = this.info+"name3,3,80,87,75,";
		
	}
	//학생들의 정보를 파싱해서 총점과 평균도 계산 후 전체 출력
	//학생의 정보를 추가
	//학생의 정보를 제거
	
	public ArrayList<StudentDTO> test() {
		ArrayList <StudentDTO> al = new ArrayList<>();
		StringTokenizer token = new StringTokenizer(this.info,",");
		while(token.hasMoreTokens()){
			StudentDTO st = new StudentDTO();
			st.setName(token.nextToken());
			st.setNum(Integer.parseInt(token.nextToken()));
			st.setKor(Integer.parseInt(token.nextToken()));
			st.setEng(Integer.parseInt(token.nextToken()));
			st.setMath(Integer.parseInt(token.nextToken()));
			st.setTotal(st.getKor()+st.getEng()+st.getMath());
			st.setAvg(st.getTotal()/3);
			al.add(st);
		}
		return al;
	}
	
	public void addst(ArrayList <StudentDTO> al ) {
		StudentDTO st = new StudentDTO();
		System.out.println("추가하고 싶은 학생의 이름을 입력하세요");
		st.setName(sc.next());
		System.out.println("추가하고 싶은 학생의 번호를 입력하세요");
		st.setNum(sc.nextInt());
		System.out.println("추가하고 싶은 학생의 국어점수를 입력하세요");
		st.setKor(sc.nextInt());
		System.out.println("추가하고 싶은 학생의 영어점수를 입력하세요");
		st.setEng(sc.nextInt());
		System.out.println("추가하고 싶은 학생의 수학점수를 입력하세요");
		st.setMath(sc.nextInt());
		st.setTotal(st.getKor()+st.getEng()+st.getMath());
		st.setAvg(st.getTotal()/3);
		al.add(st);
	}
	
	public StudentDTO removest(ArrayList <StudentDTO> al) {
		StudentDTO st = null;
		System.out.println("삭제하고 싶은 학생의 번호를 입력하세요");
		int a = sc.nextInt();
		for(int i=0;i<al.size();i++) {
			if(al.get(i).getNum()==a) {
				st = al.remove(i);
				break;
			}
			
		}
		return st;
	}
	
}
