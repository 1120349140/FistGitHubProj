package cn.kgc.kd61.lj.cha5.p1;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		//����һ
//		String[] names;
//		names = new String[10];
//		names[0] = "����";
//		names[1] = "����";
//		names[2] = "����";
//		names[3] = "������";
//		names[4] = "��������";
//		
//		System.out.println(names.length);
//		
//		//��ǿ��forѭ����foreach		1��ʹ�ÿ��ԣ������޸�    2����������Ԫ��
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		//������
//		String[] names;
//		names = new String[10];
//		int ix = 0;//��ζ��������������Ԫ�ص�����
//		names[ix++] = "����";
//		names[ix++] = "����";
//		names[ix++] = "����";
//		names[ix++] = "������";
//		names[ix++] = "��������";
//		
//		for (int i = 0; i < ix; i++) {
//			System.out.println(names[i]);
//		}
		
		//�ϲ���������
//		String[] names1 = {};
//		int size1 = 0;
//		String[] names2 = {};
//		int size2 = 0;
//		
//		if(names1.length-size1>=size2) {
//			//��name2�ϲ���names1��
//		}else if(names2.length-size2>=size1) {
//			//��name1�ϲ���names2��
//		}else {
//			String[] names = new String[size1+size2];
//			
//		}
		
		
//		int[][] table = {
//				{1,2,3},
//				{11,22,33,44},
//				{111,222,333,444,555}
//			};
//		
//		for (int[] arr : table) {
//			for (int val : arr) {
//				System.out.print(val+"\t");
//			}
//			System.out.println();
//		}
		
		//һ��ѭ��/����ѭ������Ӧ��
		//���3λ��ˮ�ɻ���		abc == a*a*a+b*b*b+c*c*c
		//һ��ѭ��
//		int no,ten,hundred,sum;
//		for (int i = 100; i <= 999; i++) {
//			no = i%10;			//(i/1)%10
//			ten = (i/10)%10;	//(i/10)%10
//			hundred = i/100;	//(i/100)%10
//			sum = no*no*no+ten*ten*ten+hundred*hundred*hundred;
//			if(i==sum) {
//				System.out.println(i);
//			}
//		}
		
		//����ѭ��
		int temp,sum;
		for (int i = 100; i <= 999; i++) {
			temp = i;
			sum = 0;
			while(temp>=1) {
				sum += (int)Math.pow(temp%10, 3);
				temp/=10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
		
		//����ѭ��+һά���龭��Ӧ��
		//�ҳ�1~1000֮�������
		
		//����ѭ��+��ά���龭��Ӧ��
		//�������һ��12���µ�����
		
		
	}

}
