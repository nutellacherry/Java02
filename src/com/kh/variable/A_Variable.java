package com.kh.variable;

public class A_Variable {

	// �ñް� �ٹ� �ð��� �ٹ��ϼ��� ���ؼ� ������ ����ؼ� ����ϴ� �޼ҵ�
	public void printvariable() {
		
		System.out.println("===== ���� ��� ��=====");
		
		System.out.println("�ñ� : 8500��");
		System.out.println("�ٹ��ð� : 6�ð�");
		System.out.println("�ٹ��ϼ� : 8��");
		
		// ���� = �ñ� X �ٹ��ð� X �ٹ��ϼ�
		// ������ �� ���� 000�� ����ϰ� �ʹٸ�
		System.out.println("������ : " + (9450 * 6 * 8) + "��"  );
		System.out.println("������ : " + (9450 * 6 * 8) + "��"  );
		System.out.println("������ : " + (9450 * 6 * 8) + "��"  );
		System.out.println("������ : " + (9450 * 6 * 8) + "��"  );
		System.out.println("������ : " + (94500 * 6 * 8) + "��"  ); //�ڹٿ��� ���� * ��ȣ<<
		
		// ���� ��� ��
		System.out.println("=====���� ��� ��=====");
		
		int pay = 9450; // �ڹٿ��� = ��ȣ�� �����ϴٶ�� ���� �ƴ϶� 8500 �̶�� ���� pay ��� ���ڿ� �ְڴ�, �� �����ϰڴ� ��� �ǹ��̴�.
		int time = 6;
		int day = 8;
		
		System.out.println("������ : " + (pay * time * day) +"��");
		System.out.println("�ٴٴ� : " + (pay * time * day) +"��");
		System.out.println("���� : " + (pay * time * day) +"��");
		System.out.println("������ : " + (pay * time * day) +"��");
		System.out.println("������ : " + (pay * time * day) +"��");
		
		/*
		 * ������ ����ϴ� ����
		 * 1. ������ �켱������ ���� �ǹ� �ο��� �������� ����. (������ ��)
		 * 2. �� �� �� ���� ����ϰ� �ʿ��� ������ --> ������ ���� �������� ����. (���뼺 ��)
		 * 3. ���������� ������
		 */
	}
	
	//������ ����
	public void declarevariable() {
		
		/*
		 * ������ ����
		 * ���� ����ϱ� ���� ������ �޸� ������ Ȯ��, �Ҵ��Ѵ�. => ��, ���� �����ϱ� ���� ����
		 * 
		 * [ǥ����] �ڷ��� �����̸�;
		 *
		 * �ڷ��� : ������ ũ�� �� ����� �������ִ� �κ�
		 * �����̸� : ������ �̸��� �ٿ��ִ� �κ� (�ǹ̺ο�)
		 * 
		 * ���� ���� �� ��������
		 * 1. �����̸��� �ҹ��ڷ� ����!!!!! / ��, ��Ÿ�� ǥ����� ��ų �� / ����� �Ұ�.
		 * 2. ���� ���� �� ({}) ������ ������ ���������� ���� �Ұ� => ��, �ߺ� ����
		 * 3. �ش� ���� �� ({]) ���� ����� ������ �� ���� �ȿ����� ��� ����
		 *  => �ٸ� �޼ҵ忡���� ���Ұ�
		 */
		
		
		// ----- �ڷ����� ���� ���� -----
		// 1. ���� (���� = true / false)
		boolean isTrue;
		boolean isFalse = true; // 1byte, ��������� ���ÿ� ���� ����(=), �� ����
		System.out.println ("isFalse�� ���ο� ���� ���� ��" + isFalse);
		
		isTrue = 1 + 3 < 1; // false
		
		isTrue = true; // 3+1 > 1 => 4�� 1���� Ů�ϱ�? �� (true)
		isFalse = false; // 4+2 < 1 => 6���� 1�� Ů�ϱ�? �ƴϿ� (false)
		
		// 2. ������
		// 2_1. ������ (�Ҽ��� X)
		byte bNum; // 1byte ( -128 ~ 127)
		bNum = -128;
		bNum = 0;
		
		short sNum = 1000; // 2byte
		
		int iNum = 10000; // 4byte, �������� �⺻ �ڷ���(��ǥ��)
		
		long lNum = 100000; // 8byte
		
		// 2_2. �Ǽ��� (�Ҽ��� O)
		float fNum = 0.0f; // 4byte => �Ҽ��� 7�ڸ����� ǥ�� ����
							// float�� ��� double�� ���� �����ϱ� ���� �� �ڿ� f�� �ٿ��ش�.
		
		double dNum = 0; // 8byte => �Ҽ��� 15�ڸ����� ǥ�� ����
									//�Ǽ����� �⺻ �ڷ���!!!!!!!!(����ȯ Casting)
		//3. ������
		//3_1.  ����
		char ch = 'a'; // 2byte char = ĳ����
		char kim;
		kim = '��';
		
		// 3_2. ���ڿ�
		String str; // ������
		str = "abc";
		str = "def"; // ���ڿ��� ��ȯ ����(����� ���)
		
		//���� �� ������ Ȯ���غ���!
		System.out.println(isTrue);
		System.out.println("isFalse�� ���ο� ���� ���� �� : " + isFalse);
		System.out.println(bNum);
		//System.out.println(-128);
		
		//���� �̸� : ���� ���·� ����ϰ� �ʹ�!
		System.out.println(" sNum: " + sNum);
		System.out.println(" iNum: " + iNum);
		System.out.println(" lNum: " + lNum);
		System.out.println(" fNum: " + fNum);
		System.out.println(" dNum: " + dNum);
		System.out.println(" ch: " + ch);
		System.out.println(" kim: " + kim);
		System.out.println(" str: " + str);
		
		// ����� ����!
		// [ǥ����]  final(���̴� ���� ������ �ƴϰ� ����� �ȴ�) �ڷ��� ����̸�;
		final int AGE; // ������� ��� �빮�ڷ� ���´�!
		AGE = 10; // �ʱ�ȭ
		
		System.out.println("AGE : " + AGE);
		
		//AGE = 11; //����� ���� ������ �Ұ��ϴ�!!
		
		System.out.println("AGE : " + AGE);
		
		// ��ǥ���� ����� ���� 3.14 (����, ������)
		System.out.println("���� : " + Math.PI);
		
		//����
		// = 999999999; // �������� ���� '_' ���
		int etc = 999_999_999;
		
		System.out.println("etc : " + etc);
		
		//* ������� ��Ģ
		int number; //����� = �ǰ� 
		
		// 1) ���� �������� �ߺ��� �̸� �ȵ�!!
		// int number;
		// ��ҹ��ڴ� ����
		
		int numBer;
		
		// 2) ����� (�̹� �ڹٿ��� ���ǰ� �ִ� Ű����) ���x
		/*
		int true;
		int abstract;
		int class;
		int static;
		int public;
		*/
		
		// 3) ���� ��� �����ϳ� ��, ���ڷ� �����ϴ°� �ȵ�
		int number1;
		int num1ber;
		//int 1number;
		
		// 4) Ư������ ��� �����ϳ� ��, _ $ ���� Ư�����ڴ� �Ұ���
		int number_1;
		int _number;
		int number$1;
		//int number!1;
		//int number#1;
		
		//�������!! (������ ���� ������ ���������� �ϴ°�!) �����ڰ��� ��Ģ(�ų�)
		// ��Ÿǥ��� (�ι�° �ܾ���� ù���ڸ� �빮�ڷ� �ۼ�)
		String username; //���ʻ� Ʋ��
		String userName; //���ʻ� �´� ǥ��!!
		String userNameTest;
		
		// 2) �ѱ� ��� �����ϳ� ������ ��������!
		String ����; //�ѱ��� ������� �ʴ� ȯ�濡�� �ѱ��� �����ϻ�.......
		String userAge;
		
				
		
	}
	
	/*  **����**
	 *  - ��(���ͷ�) : ���α׷��� �ʿ��� �������(���� ���� �����,�����) ��
	 * 			 	 �Ǵ� ����ڰ� ���콺 �Ǵ� Ű����� �Է��� ��
	 * -  ���� : ���� �����ϱ� ���� ���� (�޸𸮿� ���� ����ϱ� ���� ����)
	 * 
	 */
}
