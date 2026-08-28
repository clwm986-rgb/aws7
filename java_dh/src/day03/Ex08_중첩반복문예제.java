package day03;

public class Ex08_중첩반복문예제 {

	public static void main(String[] args) {
		// Ex06예제에서 햇던 1~16 출력하는 예제 -> 중첩 반복문으로 작성
		// i = 1일때 시작숫자 1
		// i = 2일때 시작숫자 5 
		// 4 * i - 4 + 1
		for(int i = 1; i <= 4; i++) { // 4줄
			   
		for(int j = 1; j <= 4; j++) { // 숫자 4개 출력
				  System.out.print(4 * (i - 1 ) + j + " ");
			}
		//줄바꿈(엔터)
		System.out.println();
			}

	}

}
