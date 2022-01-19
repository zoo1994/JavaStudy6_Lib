package com.sj.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CilentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Client 입니다.");
		Socket socket = null;
		try {
			socket = new Socket("192.168.123.102", 8282);
			System.out.println("서버 접속 성공");
			System.out.println("서버로 보낼 메세지 입력");
			String message = sc.nextLine();
			System.out.println(message);//hello->h,e,l,l,o -> 01
			
			//1. output Stream을 구해오기
			OutputStream os = socket.getOutputStream();//byte(bit처리)
			OutputStreamWriter ow = new OutputStreamWriter(os);//char(문자처리)
			BufferedWriter bw = new BufferedWriter(ow);
			//전송 준비 끝
			//2. 전송
			bw.write(message+"\r\n");
			//강제로 버퍼 비우기
			bw.flush();
			
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			String message1 = br.readLine();
			System.out.println("Client : "+message1);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
