package com.kh.variable;

public class A_Variable {

	// 시급과 근무 시간과 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void printvariable() {
		
		System.out.println("===== 변수 사용 전=====");
		
		System.out.println("시급 : 8500원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 8일");
		
		// 월급 = 시급 X 근무시간 X 근무일수
		// ㅇㅇㅇ 의 월급 000로 출력하고 싶다면
		System.out.println("ㅇㅇㅇ : " + (9450 * 6 * 8) + "원"  );
		System.out.println("ㄴㄴㄴ : " + (9450 * 6 * 8) + "원"  );
		System.out.println("ㄷㄷㄷ : " + (9450 * 6 * 8) + "원"  );
		System.out.println("ㄱㄱㄱ : " + (9450 * 6 * 8) + "원"  );
		System.out.println("ㄹㄹㄹ : " + (94500 * 6 * 8) + "원"  ); //자바에서 곱셈 * 기호<<
		
		// 변수 사용 후
		System.out.println("=====변수 사용 후=====");
		
		int pay = 9450; // 자바에서 = 기호는 동등하다라는 뜻이 아니라 8500 이라는 값을 pay 라는 상자에 넣겠다, 즉 대입하겠다 라는 의미이다.
		int time = 6;
		int day = 8;
		
		System.out.println("마마마 : " + (pay * time * day) +"원");
		System.out.println("다다다 : " + (pay * time * day) +"원");
		System.out.println("라라라 : " + (pay * time * day) +"원");
		System.out.println("하하하 : " + (pay * time * day) +"원");
		System.out.println("파파파 : " + (pay * time * day) +"원");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미 부여할 목적으로 쓴다. (가독성 업)
		 * 2. 단 한 번 값을 기록하고 필요할 때마다 --> 가져다 쓰는 목적으로 쓴다. (재사용성 업)
		 * 3. 유지보수가 쉬워짐
		 */
	}
	
	//변수의 선언
	public void declarevariable() {
		
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. => 즉, 값을 보관하기 위한 구역
		 * 
		 * [표현법] 자료형 변수이름;
		 *
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 붙여주는 부분 (의미부여)
		 * 
		 * 변수 선언 시 주의할점
		 * 1. 변수이름은 소문자로 시작!!!!! / 단, 낙타봉 표기법을 지킬 것 / 예약어 불가.
		 * 2. 같은 영역 안 ({}) 에서는 동일한 변수명으로 선언 불가 => 즉, 중복 블가능
		 * 3. 해당 영역 안 ({]) 에서 선언된 변수는 그 영역 안에서만 사용 가능
		 *  => 다른 메소드에서는 사용불가
		 */
		
		
		// ----- 자료형에 대한 개념 -----
		// 1. 논리형 (논리값 = true / false)
		boolean isTrue;
		boolean isFalse = true; // 1byte, 변수선언과 동시에 값을 대입(=), 즉 저장
		System.out.println ("isFalse에 새로운 값을 대입 전" + isFalse);
		
		isTrue = 1 + 3 < 1; // false
		
		isTrue = true; // 3+1 > 1 => 4는 1보다 큽니까? 네 (true)
		isFalse = false; // 4+2 < 1 => 6보다 1이 큽니까? 아니오 (false)
		
		// 2. 숫자형
		// 2_1. 정수형 (소숫점 X)
		byte bNum; // 1byte ( -128 ~ 127)
		bNum = -128;
		bNum = 0;
		
		short sNum = 1000; // 2byte
		
		int iNum = 10000; // 4byte, 정수형의 기본 자료형(대표적)
		
		long lNum = 100000; // 8byte
		
		// 2_2. 실수형 (소숫점 O)
		float fNum = 0.0f; // 4byte => 소숫점 7자리까지 표현 가능
							// float의 경우 double과 값을 구분하기 위해 값 뒤에 f를 붙여준다.
		
		double dNum = 0; // 8byte => 소숫점 15자리까지 표현 가능
									//실수형의 기본 자료형!!!!!!!!(형변환 Casting)
		//3. 문자형
		//3_1.  문자
		char ch = 'a'; // 2byte char = 캐릭터
		char kim;
		kim = '김';
		
		// 3_2. 문자열
		String str; // 참조형
		str = "abc";
		str = "def"; // 문자열은 변환 가능(상수는 노노)
		
		//값이 잘 담겼는지 확인해보자!
		System.out.println(isTrue);
		System.out.println("isFalse에 새로운 값을 넣은 후 : " + isFalse);
		System.out.println(bNum);
		//System.out.println(-128);
		
		//변수 이름 : 값의 형태로 출력하고 싶다!
		System.out.println(" sNum: " + sNum);
		System.out.println(" iNum: " + iNum);
		System.out.println(" lNum: " + lNum);
		System.out.println(" fNum: " + fNum);
		System.out.println(" dNum: " + dNum);
		System.out.println(" ch: " + ch);
		System.out.println(" kim: " + kim);
		System.out.println(" str: " + str);
		
		// 상수의 선언!
		// [표현법]  final(붙이는 순간 변수가 아니고 상수가 된다) 자료형 상수이름;
		final int AGE; // 상수명은 모두 대문자로 적는다!
		AGE = 10; // 초기화
		
		System.out.println("AGE : " + AGE);
		
		//AGE = 11; //상수는 값의 변경이 불가하다!!
		
		System.out.println("AGE : " + AGE);
		
		// 대표적인 상수의 예는 3.14 (파이, 원주율)
		System.out.println("파이 : " + Math.PI);
		
		//번외
		// = 999999999; // 가독성을 위해 '_' 사용
		int etc = 999_999_999;
		
		System.out.println("etc : " + etc);
		
		//* 변수명명 규칙
		int number; //노란줄 = 권고 
		
		// 1) 같은 영역내에 중복된 이름 안됨!!
		// int number;
		// 대소문자는 구분
		
		int numBer;
		
		// 2) 예약어 (이미 자바에서 사용되고 있는 키워드) 사용x
		/*
		int true;
		int abstract;
		int class;
		int static;
		int public;
		*/
		
		// 3) 숫자 사용 가능하나 단, 숫자로 시작하는건 안됨
		int number1;
		int num1ber;
		//int 1number;
		
		// 4) 특수문자 사용 가능하나 단, _ $ 외의 특수문자는 불가능
		int number_1;
		int _number;
		int number$1;
		//int number!1;
		//int number#1;
		
		//권장사항!! (오류는 나지 않으나 지켜줬으면 하는거!) 개발자간의 규칙(매너)
		// 낙타표기법 (두번째 단어부터 첫글자를 대문자로 작성)
		String username; //관례상 틀림
		String userName; //관례상 맞는 표현!!
		String userNameTest;
		
		// 2) 한글 사용 가능하나 무조건 영문으로!
		String 나이; //한글을 사용하지 않는 환경에선 한글은 오류일뿐.......
		String userAge;
		
				
		
	}
	
	/*  **정리**
	 *  - 값(리터럴) : 프로그램상에 필요한 명시적인(내가 직접 기술한,명시한) 값
	 * 			 	 또는 사용자가 마우스 또는 키보드로 입력한 값
	 * -  변수 : 값을 저장하귀 위한 공간 (메모리에 값을 기록하기 위한 공간)
	 * 
	 */
}
