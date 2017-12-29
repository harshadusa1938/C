package com.statwithjava;

public class ArrayTest {

	public static void main(String[] args) {
		//dataType arrayName[];
		//arrayName= {};
		
		int a[];
		a = new int[6];

		int cnt=1;
		for(int i=0;i<a.length;i++) {
			a[i]=10*cnt;
			cnt=cnt+1;
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(a[i]); 
		}
		
		System.out.println("******************************");
		
		int b[];
		//int b[] = {2,4,6,8,10,12};
		
		b=new int[6];
		cnt=1;
		for(int i=0;i<b.length;i++)
		{
			b[i]=2*cnt;
			cnt=cnt+1;
		}
		
		for(int i=0;i<6;i++) {
			System.out.println(b[i]); 
		}
		
		int sum = 0;
		for(int i=0;i<6;i++) {
			sum = sum+b[i];
		}
		
		System.out.println("Summation:"+sum);

	}

}
