package day02;

import java.util.Scanner;

public class Ex10_if문연습예제 {

	public static void main(String[] args) {
		/**
		 * Scanner를 이용하여 정수를 입력 받아 정수가 양수 or  0 or  음수인지 판별 코드
		 * 예시 1
		 * 정수 입력 : 10
		 * 10은 양수
		 * 
		 * 예시 2
		 * 음수 입력 : -3
		 * -3은 음수
		 * 
		 * 예시 3
		 * 정수 입력 : 0
		 * 0
		 */
		  System.out.print("정수 입력 : ");
		  Scanner scan = new Scanner(System.in);
		  int num = 0;
		  
		  if (num >  0) {
		  System.out.print(num + "양수 입니다.: ");
		  }else if(num < 0) {
			  System.out.print(num + "음수 입니다. ");
		  }else{
				  System.out.println(num);
			  }
//		  }else if(num == 0) {
//			  System.out.print("0 입니다. ");
		  }
	}

