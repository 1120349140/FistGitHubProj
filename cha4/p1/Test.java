package cn.kgc.kd61.lj.cha4.p1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//��һ�����ߵ����ˣ���Ů�Ѵ�����վ���½ֿڵ������Ϻ�100��"�Ұ���"
//		int i = 0;
//		while(i<100) {
//			System.out.println("�Ұ���..."+(i+1));
//			i++;
//		}
		
		//do...whileѭ�����˵�ѡ������
		
//		do {
//			System.out.print("��ѡ��(1����ѯ���  2����ֵ  3���˹�����  4���˳�)��");
//			int choice = input.nextInt();
//			
//			switch(choice) {
//			case 1:
//				System.out.println("��ѯ���...");
//				continue;
//			case 2:
//				System.out.println("��ֵ...");
//				continue;
//			case 3:
//				System.out.println("�˹�����...");
//				continue;
//			case 4:
//				System.out.println("�˳�ϵͳ��");
//				break;//�˳�switch...case
//			default:
//				System.out.println("ѡ������������ѡ��");
//				continue;
//			}
//			break;//�˳�ѭ��
//		}while(true);
//		input.close();
		
		//��1~1000֮��ĺ�
//		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			sum += i;
//		}
//		System.out.println("1~1000�ۼӺ�Ϊ��"+sum);
		
		//��1~1000֮��ż����
//		for (int i = 2; i <= 1000; i+=2) {
//			sum += i;
//		}
//		System.out.println("1~1000ż����Ϊ��"+sum);
		
		//��1~1000֮���ܱ�3��������֮�ͣ�83667
//		for (int i = 1; i <= 1000; i++) {
//			if(i%3==0) {
//				sum += i;
//			}
//		}
		
//		int count = 1000/3;
//		for (int i = 1; i <= count; i++) {
//			sum+=i*3;
//		}
//		System.out.println("1~1000�ܱ�3����֮����Ϊ��"+sum);
		
		//ֵ����
//		int a = 5,b = 8,t;
//		System.out.println("a="+a+",b="+b);
//		t = a;
//		a = b;
//		b = t;
//		System.out.println("a="+a+",b="+b);
		
		//�������		12345	=>	54321
//		System.out.print("������5λ������");
//		int value = input.nextInt();
//		
//		while(value>=1) {
//			System.out.print(value%10);//ȡ��
//			value/=10;//��λ
//		}
		
		//������֤��ֻ�ܱ�1���Լ���������					//�ҳ�1-1000֮�������������ѭ��[+һά����]��
//		System.out.print("������������");
//		int value = input.nextInt();
//		
//		boolean is = true;//���ñ�ʶ
//		for (int i = 2; i < value; i++) {//��֤���޸ı�ʶ
//			if(value%i==0) {
//				is = false;
//				break;
//			}
//		}
//		
//		char rst = is ? '��' : '��';
//		System.out.println(value+""+rst+"����");
		
		//����̨���������գ������һ������һ��ĵڶ�����	//�����꣬�����һ���12���µ�����������ѭ��+��ά���飩 
		//����ƽ�꣺�ܱ�4���������ܱ�100�������ܱ�400����
		//����Ӱ��2�·�����������2��29��/ƽ��2��28��
		//һ����1,3,5,7,8,10,12���£�31��
		//һ����4,6,9,11С�£�30��
		
		int year,month,day,total=0,totalThisYear,weekDay;
		System.out.print("�������꣺");
		year = input.nextInt();
		System.out.print("�������£�");
		month = input.nextInt();
		System.out.print("�������գ�");
		day = input.nextInt();
		
		total += day;
		
		for (int i = 1; i < month; i++) {
			switch(i) {
			case 2:
				total += (year%4==0 && year%100!=0) || year%400==0 ? 29 : 28;
				break;
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				total += 31;
				break;
			case 4:case 6:case 9:case 11:
				total += 30;
				break;
			}
		}
		
		totalThisYear = total;
		
		//�����һ�������ڼ�?
		for (int i = 1900; i < year; i++) {
			total += (i%4==0 && i%100!=0) || i%400==0 ? 366 : 365;
		}
		
		weekDay = total%7;
		
		System.out.println(MessageFormat.format("{0}��{1}��{2}����{0}��ĵ�{3}��,��һ��������{4}",year,month,day,totalThisYear,weekDay));
		
		
		
	}

}
