package com.Jenkins;

public class Jenkins {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6,7};
		int b[] = {1,2,3,4,5,6};
		int sum1 =0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) {
			sum1 +=a[i];
		}
		for(int i=0;i<b.length;i++) {
			sum2 +=b[i];
		}
		System.out.println(sum1-sum2);

	}

}
