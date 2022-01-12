package com.sj.s1.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {
	
	public static void main (String[]args) {
		
		String str = "봄,10, 여름,20, 가을,30, 겨울,40";
		
		StringTokenizer st = new StringTokenizer(str,","); 
		
		ArrayList<SeasonDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken();
			seasonDTO.setName(token);//봄
			
			token = st.nextToken();
			seasonDTO.setGion(Integer.parseInt(token));
			
			ar.add(seasonDTO);
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getGion());
		}
				for(int i=0;i<ar.size();i++) {
					System.out.println(ar.get(i).getGion());
					System.out.println(ar.get(i).getName());
				}
		
	}

}
