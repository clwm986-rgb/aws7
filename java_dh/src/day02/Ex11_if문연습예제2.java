package day02;

import java.util.Scanner;

public class Ex11_if문연습예제2 {

	public static void main(String[] args) {
		// 예제08_콘솔입력예제를 참고해서 두 정수와 연산자를 입략해사 연산 결과ㅡㄹ 출력

		  Scanner scan = new Scanner(System.in);
		 
		  System.out.print("첫번째 정수 입력 하세요 : ");
		  int num1 = scan.nextInt();
		  
		  System.out.print("연산자 입력 : ");
		  char op = scan.next().charAt(0);
		  
		  
		  System.out.print("두번째 정수 입력 하세요 : ");
		  int num2 = scan.nextInt();
		  
		  if (op == '+') {
			  System.out.print(" " + num1 + op + num2 + "=" + (num1 + num2));
		  }else if(op == '-') {
			  System.out.print(" " + num1 + op + num2 + "=" + (num1 - num2));
		  }else if(op == '*') {
			  System.out.print(" " + num1 + op + num2 + "=" + (num1 * num2));
		  }else if(op == '/') {
			  System.out.print(" " + num1 + op + num2 + "=" + (num1 / (double)num2));
		  }else if(op == '%') {
			  System.out.print(" " + num1 + op + num2 + "=" + (num1 % num2));
		  }else {
			  System.out.println(op + "는 산술 연산자가 아닙니다.");
		  }
		 
	}

}
