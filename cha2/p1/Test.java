package cn.kgc.kd61.lj.cha2.p1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		String msg = MessageFormat.format("������{0}\n���ţ�{1}", new Object[] {"henry",1});
//		System.out.println(msg);
		
//		System.out.println(Math.PI);
		
		//����̨����һ���˵����������䡢�Ա��Ƿ�Ա������������ݣ���ʽ�������̨���
		Scanner input = new Scanner(System.in);
		//�ӿ���̨�����ַ���
		System.out.print("������������");
		String name = input.next();
		//����̨��������
		System.out.print("���������䣺");
		int age = input.nextInt();
		//����̨���ܵ��ַ�
		System.out.print("�������Ա�");
		char gender = input.next().charAt(0);
		//����̨���ܲ���ֵ
		System.out.print("�Ƿ��ǵ�Ա��");
		boolean isMember = input.nextBoolean();
		char is = isMember ? '��' : '��';
		//����̨����С��
		System.out.print("�����빤�ʣ�");
		double salary = input.nextDouble();
		
		String msg = MessageFormat.format("������{0}\n���䣺{1}\n�Ա�{2}\n�Ƿ�Ա��{3}\n�����룺{4}", 
				name,age,gender,is,salary);
		
		System.out.println(msg);
		
		input.close();
		
//		System.out.println(5/2);
//		System.out.println(5%2);
		
//		System.out.println(3>5);
//		System.out.println((int)'1');
//		System.out.println((int)'a');
//		System.out.println('1'>'a');
//		String a = "aBc";
//		String b = "abc";
//		System.out.println(a.equalsIgnoreCase(b));
//		System.out.println(true==true);
//		System.out.println(!false);
		
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
//		
//		int a = 3;
//		System.out.println(a>=3 && a++>4);
//		System.out.println(a);
		
//		int a = 5;
//		a++;
//		a+=1;
//		a=a+1;
//		System.out.println(a++);
//		System.out.println(a);
		
	}

}
