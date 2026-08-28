package day02;

import java.util.Scanner;

public class Ex08_콘솔입력연습예제 {

	public static void main(String[] args) {
		/** Scanner 사용하여 숫자 입력 받고, 
		* 입력 받은 숫자를 출력하는데 0을 입력하면 종료 되도록 코드 작성 * */
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("입력 : ");
			num = scan.nextInt();
			System.out.println(num + "이 입력됐습니다.");
		}while(num != 0);
		System.out.println("프로그램을 종료합니다.");
		    }
		}

