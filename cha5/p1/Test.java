package cn.kgc.kd61.lj.cha5.p1;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		//方法一
//		String[] names;
//		names = new String[10];
//		names[0] = "张三";
//		names[1] = "李四";
//		names[2] = "王五";
//		names[3] = "张三丰";
//		names[4] = "张三疯子";
//		
//		System.out.println(names.length);
//		
//		//增强型for循环：foreach		1、使用可以，不能修改    2、遍历所有元素
//		for (String name : names) {
//			System.out.println(name);
//		}
		
		//方法二
//		String[] names;
//		names = new String[10];
//		int ix = 0;//意味着索引，数组中元素的数量
//		names[ix++] = "张三";
//		names[ix++] = "李四";
//		names[ix++] = "王五";
//		names[ix++] = "张三丰";
//		names[ix++] = "张三疯子";
//		
//		for (int i = 0; i < ix; i++) {
//			System.out.println(names[i]);
//		}
		
		//合并两个数组
//		String[] names1 = {};
//		int size1 = 0;
//		String[] names2 = {};
//		int size2 = 0;
//		
//		if(names1.length-size1>=size2) {
//			//将name2合并到names1中
//		}else if(names2.length-size2>=size1) {
//			//将name1合并到names2中
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
		
		//一重循环/二重循环经典应用
		//求出3位数水仙花数		abc == a*a*a+b*b*b+c*c*c
		//一重循环
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
		
		//二重循环
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
		
		
		//二重循环+一维数组经典应用
		//找出1~1000之间的质数
		
		//二重循环+二维数组经典应用
		//输出任意一年12个月的日历
		
		
	}

}
