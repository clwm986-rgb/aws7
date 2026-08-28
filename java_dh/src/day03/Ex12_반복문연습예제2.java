package day03;

public class Ex12_반복문연습예제2 {

	public static void main(String[] args) {
		/*다음과 같이 출력 되도록 코드 작성
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 바녹횟수 : i는 1~5까지 1씩 증가
		 * 실행문 : 1~i까지 출력 후 엔터
		 * 
		 * 반복횟수 : j는 1~i까지 1씩 증가
		 * 실행문 : j 출력 println()
		 */

	for(int i = 1; i<=5; i++) {
		for(int j = 1; j <=i; j ++ ) { //1~i까지 출력
			System.out.print(j);
		}
		System.out.println(); //엔터
	}
	/* a
	 * ab
	 * abc
	 * abcd
	 * abcde ...z
	 */
	//char 변수 사용하여 자료형변환ㅇㅇ
	for (char i = 'a'; i <= 'z'; i++) {
	    for (char j = 'a'; j <= i; j++) {
	        System.out.print((char)j);
	    }
	    System.out.println();//엔터
	}
	
	//char 변수 사용하여 자료형변환 ㄴㄴ
	for (char i = 'a'; i <= 'z'; i++) {
		for (char j = 'a'; j <= i; j++) { //1부터 i까지 출력
			System.out.print(j);
		}
		System.out.println();//엔터
	}
	}
}


