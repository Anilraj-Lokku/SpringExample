package com.Anil;

public class isPalindromePossible {
	public int isPalinPossible(int input1) {
		int[]array=new int[10];
		while(input1>0){
			array[input1%10]++;
			input1/=10;
		}
		int odd=0;
		for(int i=0;i<10;i++){
			if((array[i]&1)==1){
				odd++;
			}
			if(odd>1){
				return 1
			}
		}
		return 2;
	}
}
