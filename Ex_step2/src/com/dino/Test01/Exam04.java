package com.dino.Test01;

public class Exam04 {
	public static void main(String[] args) {
		int sum=0, i=0;
		
		while(true) {
			
			i++;
			
			if(i%2==1) {
				sum += i;  //홀수 일때는 더하고 
			}else {
				sum -= i;  //짝수 일때는 빼고
			}
			
			if(sum>=100)
				break;
		}
		
		System.out.println("i = " + i +", sum = " + sum);

	}
}
