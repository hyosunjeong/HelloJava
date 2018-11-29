package com.biz.hello;

public class Hello05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubHello01 s1 = new SubHello01();
		s1.view1(); //0 - console에 보여짐
		s1.view1(); //0 - console에 보여짐
		
		s1.addList(); //1 
		s1.view1(); //1 - console에 보여짐
		
		s1.addList(); //2
		s1.addList(); //3
		s1.addList(); //4
		s1.view1();  //4 - console에 보여짐
	
		

	}
	
}

class sub{
	
}

