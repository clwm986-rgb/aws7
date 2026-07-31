package day03;

public class Ex06_반복문연습예제 {
	public static void main(String[] args) {
		/* 다음과 같이 출력 되도록 코드 작성
		 *  1 2 3 4
		 *  5 6 7 8
		 *  9 10 11 12
		 *  13 14 15 16
		 *  
		 *  print()로 숫자 출력, 4의 배수가 아니면 ' ' 을 출력 4의 배수이면 println()을 출력 
		 */

		for(int i = 1; i <= 16; i++) {
		   System.out.print(i);
		if(i % 4 == 0 ) {
			   System.out.println();
		   }else {
			   System.out.print(" ");
		   }
		}
		}
	}
	

