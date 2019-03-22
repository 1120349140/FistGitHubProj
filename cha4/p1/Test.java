package cn.kgc.kd61.lj.cha4.p1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//有一个悲催的男人，被女友处罚：站在新街口的天桥上喊100遍"我爱你"
//		int i = 0;
//		while(i<100) {
//			System.out.println("我爱你..."+(i+1));
//			i++;
//		}
		
		//do...while循环做菜单选择和输出
		
//		do {
//			System.out.print("请选择(1、查询余额  2、充值  3、人工服务  4、退出)：");
//			int choice = input.nextInt();
//			
//			switch(choice) {
//			case 1:
//				System.out.println("查询余额...");
//				continue;
//			case 2:
//				System.out.println("充值...");
//				continue;
//			case 3:
//				System.out.println("人工服务...");
//				continue;
//			case 4:
//				System.out.println("退出系统！");
//				break;//退出switch...case
//			default:
//				System.out.println("选择有误，请重新选择");
//				continue;
//			}
//			break;//退出循环
//		}while(true);
//		input.close();
		
		//求1~1000之间的和
//		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			sum += i;
//		}
//		System.out.println("1~1000累加和为："+sum);
		
		//求1~1000之间偶数和
//		for (int i = 2; i <= 1000; i+=2) {
//			sum += i;
//		}
//		System.out.println("1~1000偶数和为："+sum);
		
		//求1~1000之间能被3整除的数之和：83667
//		for (int i = 1; i <= 1000; i++) {
//			if(i%3==0) {
//				sum += i;
//			}
//		}
		
//		int count = 1000/3;
//		for (int i = 1; i <= count; i++) {
//			sum+=i*3;
//		}
//		System.out.println("1~1000能被3整除之数和为："+sum);
		
		//值交换
//		int a = 5,b = 8,t;
//		System.out.println("a="+a+",b="+b);
//		t = a;
//		a = b;
//		b = t;
//		System.out.println("a="+a+",b="+b);
		
		//逆序输出		12345	=>	54321
//		System.out.print("请输入5位整数：");
//		int value = input.nextInt();
//		
//		while(value>=1) {
//			System.out.print(value%10);//取余
//			value/=10;//降位
//		}
		
		//质数验证：只能被1和自己整除的数					//找出1-1000之间的质数（二重循环[+一维数组]）
//		System.out.print("请输入整数：");
//		int value = input.nextInt();
//		
//		boolean is = true;//设置标识
//		for (int i = 2; i < value; i++) {//验证并修改标识
//			if(value%i==0) {
//				is = false;
//				break;
//			}
//		}
//		
//		char rst = is ? '是' : '非';
//		System.out.println(value+""+rst+"质数");
		
		//控制台输入年月日，输出这一天是这一年的第多少天	//输入年，输出这一年的12个月的日历（二重循环+二维数组） 
		//闰年平年：能被4整除但不能被100整除或能被400整除
		//闰年影响2月份天数：闰年2月29天/平年2月28天
		//一年中1,3,5,7,8,10,12大月：31天
		//一年中4,6,9,11小月：30天
		
		int year,month,day,total=0,totalThisYear,weekDay;
		System.out.print("请输入年：");
		year = input.nextInt();
		System.out.print("请输入月：");
		month = input.nextInt();
		System.out.print("请输入日：");
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
		
		//算出这一天是星期几?
		for (int i = 1900; i < year; i++) {
			total += (i%4==0 && i%100!=0) || i%400==0 ? 366 : 365;
		}
		
		weekDay = total%7;
		
		System.out.println(MessageFormat.format("{0}年{1}月{2}日是{0}年的第{3}天,这一天是星期{4}",year,month,day,totalThisYear,weekDay));
		
		
		
	}

}
