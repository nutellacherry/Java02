package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		//키 000인 99살 남자 ㅇㅇㅇ님 반갑습니다^^
		//젠더에서 남/여를 쓰는데 남자/여자로 출력되게 하고싶음
		//그렇기 위해서는 printf를 쓰는쪽이 더 좋지않을까?
		
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자인 " + name + "님 반갑습니다 ^^ ");
		
	}

}
