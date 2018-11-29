package com.biz.hello;

import java.util.ArrayList;
import java.util.List;

public class Hello04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = new String[5];
		// strArray는 몇개?(=길이:lenght)
		
		// 문자열만을 추가해서 list로 만들기 위한 선언
		List<String> strList = new ArrayList();
		
		// 정수 숫자만을 추가해서 list로 만들기 위한 선언
		List<Integer> intList = new ArrayList();
		
		System.out.println(strList.size()); // 1번위치에서 strList의 개수(size)는 몇개? 0개
		
		strList.add("Korea"); // 2번위치에서 strList의 개수(size)는 몇개? 1개
		
		strList.add("Korea");
		strList.add("Korea");
		strList.add("Korea");
		strList.add("Korea");
		strList.add("Korea"); 
		System.out.println(strList.size());// 3번위치에서 strList의 개수(size)는 몇개? 6개
		System.out.println(intList.size());
		intList.add(100); // 여기에서 추가 하고 위에 있는 intList.size를 물어보면 개수는 0개
						  // 여기에서 물어보면 1개
		
		
		
		
		intList.add(100);
		
		

	}

}
