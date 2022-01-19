package com.sj.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server 입니다.");
		ServerSocket serverSocket = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			serverSocket = new ServerSocket(8282);//접속준비
			System.out.println("클라이언트 접속 기다리는중");
			socket = serverSocket.accept();//client
			System.out.println("접속한 client와 1대1 연결완료");
			
			InputStream is =socket.getInputStream();//01처리
			InputStreamReader ir = new InputStreamReader(is); //char
			BufferedReader br = new BufferedReader(ir);//string
			String message = br.readLine();
			System.out.println("Client : "+message);
			
			//server에서 클라이언트로 메세지 전송
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			System.out.println("서버로 보낼 메세지 입력");
			String message1 = sc.nextLine();
			bw.write(message1+"\r\n");
			bw.flush();
		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
