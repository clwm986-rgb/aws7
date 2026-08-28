package day03;

import java.util.Scanner;

public class Ex05_dowhile문연습예제 {
	public static void main(String[] args) {
		/** Scanner 사용하여 숫자 입력 받고, 입력 받은 숫자를 출력하는데 0을 입력하면 종료 되도록 코드 작성
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int num = -1;
	      do {
	         System.out.println("숫자를 입력하세요 : " + num);
	         num--;
	      }while(num < 0);
	      num = 10;
	      while(num < 0) {
	         System.out.println("프로그램을 종료 합니다. ");
	         num--;
	      }
	}
		
	}
