package com.sj.s1.lang.object;

import java.util.Scanner;

public class ObjectStudy1 {
	ObjectMain obj = new ObjectMain();
	
	public void study1() {
		System.out.println("Study1 실행");
		int num = obj.hashCode();
		System.out.println(num);
		String name = obj.toString();
		System.out.println(name);
						
}
	public void equalTest() {
		String str = "iu";
		String str2 = new String("iu");
		System.out.println("str : "+str);
		System.out.println("str2 : "+ str2);
		System.out.println(str==str2);
		System.out.println(str.equals(str2));
	}
	
	public void indexOfTest() {
		String msg = "Hello world";
		int num = msg.indexOf('l');
		System.out.println(num);
	}
	
	public void subStringEx1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("업로드할 파일명을 입력하세요");
		String a = sc.next();
		int aa = a.length();
		String ab = a.substring(aa-3);
		if(ab.equals("jpg")||ab.equals("gif")||ab.equals("png")) {
			System.out.println("이미지 파일입니다.");
		}else if(ab.equals("txt")||ab.equals("pdf")||ab.equals("hwp")) {
			System.out.println("문서 파일입니다.");
		}else if (ab.equals("mp3")||ab.equals("wav")||ab.equals("ogg")) {
			System.out.println("음원 파일입니다.");
		}else {System.out.println("알 수 없는 파일입니다.");}
		
	}
	
	public void replaceTest() {
		String title = "West Side Story";
		title = title.replace('S', 'a');
		System.out.println(title);
	}
	
	public void tolowercaseTest(){
		String title = "West Side Story";
		title = title.toLowerCase();
		System.out.println(title);
	}
	public void touppercaseTest(){
		String title = "West Side Story";
		title = title.toUpperCase();
		System.out.println(title);
	}
	
	public void splitTest(){
		String name = "a,b,c,d,e";
		String[]names = name.split(",");
		for(int i =0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
				
	
}
}
