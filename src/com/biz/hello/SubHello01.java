package com.biz.hello;

import java.util.ArrayList;
import java.util.List;

public class SubHello01 {
	
	// member 영역
	List<String> strList = new ArrayList();
	
	
	public void view1() { // strList의 개수가 몇개인지 물어보는 것
		System.out.println(strList.size());
	}
	public void addList() { // korea라는 문자를 추가하라는 것
		strList.add("Korea");
		
	}

}
