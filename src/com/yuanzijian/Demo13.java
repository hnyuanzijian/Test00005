package com.yuanzijian;

/*
���� ���� һ����������һ��char���͵��������,Ȼ��ת�����е�Ԫ�ء�
	
char[] arr = {'a','b','c','d','e'};

*/
class Demo13 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		char[] arr = {'a','b','c','d','e'};
		reverse(arr);

	}

	public static void reverse(char[] arr){
		for(int startIndex = 0 ,endIndex = arr.length-1 ;   startIndex<endIndex ; startIndex++,endIndex--){
			char temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}

		//�������飬�鿴Ч��
		System.out.print("Ŀǰ��Ԫ�أ�");
		for (int i = 0 ; i<arr.length  ;i++){
			System.out.print(arr[i]+",");
		}

	}
}