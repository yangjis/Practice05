package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member mb1 = new Member("jws", "정우성", 50000);
		Member mb2 = new Member("yjs", "유재석", 30000);
		Member mb3 = new Member("lhr", "이효리", 40000);
		
		mb1.showInfo();
		mb2.showInfo();
		mb3.showInfo();
		
	}

}
