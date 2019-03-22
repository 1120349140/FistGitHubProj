package cn.kgc.kd61.lj.cha2.p1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		String msg = MessageFormat.format("姓名：{0}\n老婆：{1}", new Object[] {"henry",1});
//		System.out.println(msg);
		
//		System.out.println(Math.PI);
		
		//控制台接收一个人的姓名、年龄、性别、是否党员、月收入等数据，格式化后控制台输出
		Scanner input = new Scanner(System.in);
		//从控制台接受字符串
		System.out.print("请输入姓名：");
		String name = input.next();
		//控制台接受整数
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		//控制台接受单字符
		System.out.print("请输入性别：");
		char gender = input.next().charAt(0);
		//控制台接受布尔值
		System.out.print("是否是党员：");
		boolean isMember = input.nextBoolean();
		char is = isMember ? '是' : '否';
		//控制台接受小数
		System.out.print("请输入工资：");
		double salary = input.nextDouble();
		
		String msg = MessageFormat.format("姓名：{0}\n年龄：{1}\n性别：{2}\n是否党员：{3}\n月收入：{4}", 
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
