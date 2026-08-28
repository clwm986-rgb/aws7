package day06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex15_숫자야구게임 {

	public static void main(String[] args) {
		/*숫자 야구에임을 구현하세요.
		 * 1~9 사이의 중복되지 않은 3개의 랜덤한 수를 생성 : com
		 * 이 수를 맞추는 게임
		 * - 규칙 -
		 * S : 숫자가 잇고 위치같음
		 * B : 숫자가 이싲만 취기가 다름
		 * O: 일치하는 숫자 하나도 없음
		 * 3S : 게임 종료
		 * 예시
       * 랜덤 : 1 9 4
       * 입력 : 1 2 3
       * 결과 : 1S
       * 입력 : 4 5 6
       * 결과 : 1B
       * 입력 : 1 4 9
       * 결과 : 1S2B
       * 입력 : 6 7 8 
       * 결과 : O
       * 입력 : 1 9 4
       * 결과 : 3S
       * 정답입니다.
		 */
		Random random = new Random();
	    ArrayList<Integer> com = createRanbdomArray(1, 9, 3);
	    
	    System.out.println("랜덤 : " + com); //테스트용
	    
	    //3S가 될때까지 반복
	    int strike = 0, ball = 0;
	    Scanner scan = new Scanner(System.in);
	    ArrayList<Integer> user;
	    while (strike < 3) {
	    	//1~9사이 정수 3개 입력
	    	System.out.print("입력 : ");
	    	user = Ex14_List연습예제2.inputNums(3, 1, 9);
	    	
	    //스트라이크의 개수를 셈
	    strike = getStrike(com, user);	
	    
	    //볼의 개수를 셈
	    ball = getBall(com, user);
	    
	    //스트라이크와 볼의 개수를 이용하여 결과를 출력
	    printResult(strike,ball);
	    
	}
	}
	    
	private static void printResult(int strike, int ball) {
		System.out.println("결과 : ");
		// 1S, 1S2B, 2B, 0
		//스트라이크가 0이 아니면 ?S를 출력(print)
		if(strike != 0) {
			System.out.print(strike + "S");
		}
		// 볼이 0이 아니면 ?B를 출력(print)
		if(ball != 0) {
			System.out.print(ball + "B");
		}
		//스트라이크도 0이고 볼도 0이면 0을 출력(print)
		if(strike ==0 && ball ==0);
		System.out.print("O");
		//엔터 println
		System.out.println();
	}
	private static int getBall(ArrayList<Integer> com, ArrayList<Integer> user) {
		// [1 2 3] [1 3 2] :1S2B
		//3번 반복 : i는 0부터 com.size()-1까지 1씩 증가
		int ball = 0;
		int i;
		for(i=0; i<=com.size(); i++) {
			//com에서 i 번지에 잇는 값을 꺼내서 user에 잇으면
			if( user.contains(com.get(i))) {
				// Ball을 증가(이 때 계산된 볼은 실제 볼의 개수가 아니라 볼 + 스트라이크 개수)
				ball++;
			}
			//스트라이크의 개수를 구함
			int strike = getStrike(com,user);
			//볼 - 스트라이크 return
			return ball - strike;
		}
		return 0;
	}
	private static int getStrike(ArrayList<Integer> com, ArrayList<Integer> user) {
		int strike = 0;
		int i;
		//3번 반복 -> com.size()만큼 반복 -> i는 0부터 com.size()-1 까지 1씩 증가
		for(i=0; i<=com.size() -1; i++) {
			// 같은 번지에 잇는 숫자끼리 비교, 리스트.get(번지) => com의 i번지 값과 user의 i번지 값이 같으면
			if(com.get(i) == user.get(i)) {
				//스트라이크 개수를 1증가
				strike++;
			}
			//System.out.println("Strike");
		}
		// 스트라이크 개수를 리턴
		return strike;	
	}
	public static ArrayList<Integer> createRanbdomArray(int min, int max, int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		//list에 사이즈가 저장될때 까지 반복
		while(list.size() < size){

			int num = random.nextInt(min, max + 1);
			
			//랜덤수가 리스트에 없으면 : Ex14예제 참고
			if(!list.contains(num)){
				list.add(num);
			}	
		}	
		return list;
	}
}
