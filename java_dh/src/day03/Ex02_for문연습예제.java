package day03;

public class Ex02_for문연습예제 {

	public static void main(String[] args) {
		// 1~5까지 출력
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("----------------------------");
		//구구단 2단 출력
		for(int i = 1; i<=9; i++) {
			int dan = 2; //얘만 숫자 바꾸면 다른 단 가능
			System.out.println(dan + " x " + i + " = " + dan * i);
		}
		System.out.println("----------------------------");
		
//	97~122까지 출력
//	문자 a의 유니코드 값이 97, b는 98이다.
//	이 특징을 이용해 a~z까지 출력
		
	//1.자료형 변환 방법
		for(int i = 97; i<=122; i++) {
			System.out.println((char)i); 
		}
		System.out.println("----------------------------");
		
	//2.자료형 변환 방법
		for(char i = 97; i<=122; i++) {
			System.out.println(i); 
		}
		System.out.println("----------------------------");
		
	//3.자료형 변환 방법
		for(char i = 'a'; i<='z'; i++) {
			System.out.println(i); 
		}
		System.out.println("----------------------------");
		
	//1~10까지 합을 구하는 코드
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
		}
			System.out.println(sum); 
		
		
	}

}
