package com.yuanzijian;

/*
二维数组： 二维数组就是数组中的数组。

一根				变量

一盒     20根       一维数组

一条     10包   20根   二维数组


二维数组 的定义格式：
	
	数据类型[][] 变量名 = new 数据类型[长度1][长度2];

	长度1：一条烟有多少盒。

	长度2： 一盒烟有多少根。


二维数组 的初始化方式：
	
	动态初始化:
		
		数据类型[][] 变量名 = new 数据类型[长度1][长度2];


	静态初始化：

		数据类型[][]  变量名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...} ..}


*/
class Demo15{

	public static void main(String[] args) 
	{	
		//定义了一个二维数组
		int[][] arr = new int[3][4];
		arr[1][1] = 100;
		/*
		System.out.println("二维数组的长度："+ arr.length);  // 3
		System.out.println("二维数组的长度："+ arr[1].length); //
		*/
		
		System.out.println("数组的元素："+ arr[1][1]);

		
	}
}
