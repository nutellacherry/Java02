package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {

	public void inputTest1() {
		
		/*
		 * 키보드로 값을 입력하는 방법
		 * Scanner 를 사용
		 * (즉 java.util.Scanner 클래스를 이용하는 것)
		 * Scanner 클래스 내부의 메소드를 호출하여 입력 받는 것.
		 */
		
		// 스캐너 클래스의 객체 생성
		Scanner sc = new Scanner(System.in);
		// System.in 은 입력받은 값을 ====> 바이트 단위로 받아들이겠다는 의미
		//출력시에는 System.out 이라는 구문을 썼었다.	
		
		System.out.print("아무거나 입력해보세요 : ");
		String amuguna = sc.nextLine();
		
		System.out.println("입력받은 내용 : " + amuguna);
		
	}
	
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (next(), nextLine())
		//String name = sc.next();
		//사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴
		//따라서 거주지라던가 등등 이런 내용 같은 경우 공백이 있을 수 있기 때문에 제대로 된 값을 못 가져올 수 있음
		
		String name = sc.nextLine();
		// nextLine() : 사용자가 입력한 값 모두 다 읽어옴 (엔터 전까지의 모든 값)
		
		System.out.print("당신의 나이는 몇살입니까 : ");
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수로 읽어들이는 메소드

		System.out.print("당신의 키는 몇입니까(소수점  첫째 자리까지) : ");
		double height = sc.nextDouble(); // 사용자가 입력한 값을 실수로 읽어들이는 메소드
		
		// xxx님은 xx살이며, 키는 xxx.x cm 입니다.
		System.out.println(name + "님은 " + age + "살 이며, 키는 " + height + "cm 입니다.");
		
	}
	
	// 키보드로 값을 입력받을 때 종종 발생되는 문제
	public void inputTest3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		// sc.nrxtLine() : 버퍼에서 '엔터' 이전 까지의 모든 값을 가져온 후 =>> '엔터'를 비워주는 역할
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		// sc.nextLine() 외의 모든 메소드 : 해당 값만 읽어오고 '엔터'는 버퍼에 남아있음
		
		//버퍼에 남아있는 엔터를 비워주는 코드 추가
		sc.nextLine();
		// 결론 : sc.nextXXX()메소드 뒤에 sc.nextLine() 메소드가 오게 될 경우 버퍼에 남아있는 '엔터'를 비워주는 과정 필수!!!!!!
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
				
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는 곳은 xxxxx이고, 키는 xxx.xcm입니다.
		System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height + "cm 입니다.");
		System.out.printf("%s 님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm입니다.", name, age, address, height );
		
		
	}
	
	public void inputTest4() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력 받을 때 => sc.nextLine()
		// 정수값을 입력 받을 때 -> sc.nextInt()
		// 실수값을 입력 받을 때 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		//char gender = sc.nextChar(); // nextChar와 같은 메소드는 존재하지 않음!!
		char gender = sc.nextLine().charAt(0); 
		// 문자열. charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		// ** 인덱스 : 순번 같은 존재. 단, [0]부터 시작함
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		/*
		 *  xxx님의 개인정보
		 *  성별 : x
		 *  나이 : xx
		 *  키 : xxx.x
		 */
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height + "cm");
		
	}
	
	public void charAtTest() {
		
		String str = "Hello";
		
		char ch = str.charAt(0);
		System.out.println(ch);
		
		System.out.println(str.charAt(4));
		
		//System.out.println(str.charAt(10)); //StringIndexOutOfBoundsException발생
		
		
	}
	
	/*
	 *   **정리**
	 *   1. 콘솔창 (모니터)에 출력하기 위해 : System.out.print[ln]() 메소드 이용 //대괄호 : 생략가능
	 *   2. 콘솔창 (키보드)에 입력받기 위해 : Scanner 이용해서 (nextLine), nextInt(), nextDouble() . . 
	 *   
	 *   		> 주의사항
	 *   		1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야 될 경우
	 *   			sc.nextLine() 메소드를 한 번 더 써줘서 버퍼에 남아있는 '엔터'를 빼주는 과정 필수!!
	 *   		2) '문자' 값을 입력 받아야 될 경우
	 *   				sc.nextLine() 메소드를 통해 우선 문자열로 입력받고 그 뒤에 .charAt(인덱스) 메소드를 통해서 문자 하나 추출
	 *   
	 *   
	 */
	
	
}
