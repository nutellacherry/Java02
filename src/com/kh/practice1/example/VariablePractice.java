package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String gender = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		//Ű 000�� 99�� ���� �������� �ݰ����ϴ�^^
		//�������� ��/���� ���µ� ����/���ڷ� ��µǰ� �ϰ����
		//�׷��� ���ؼ��� printf�� �������� �� ����������?
		
		
		System.out.println("Ű " + height + "�� " + age + "�� " + gender + "���� " + name + "�� �ݰ����ϴ� ^^ ");
		
	}

}
