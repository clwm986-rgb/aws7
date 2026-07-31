package day08;

import java.util.ArrayList;
import java.util.Random;

public class Ex01_예외던지기 {

	public static void main(String[] args) {
		/*예외처리 방법
		 * 1. 직접처리
		 * 	-> 문제가 발생한 곳에서 직접 해결
		 * 	-> try catch문으로
		 * 
		 * 2. 예외를 넘기기
		 * 	-> 문제가 발생하면 일을 시킨 곳에게 문제를 넘김
		 * 	-> throws : 나 이런 예외 발생할 수 잇으니 사용할 때 조심해줘라고 얘기를 해야함
		 * 얘기를 안해도 되는 경우
		 * 	-> RuntimeException 예외들 : 예외처리를 하지 않아도 에러가 발생하지 않은 예외들
		 * 
		 *예외 던지기
		 *	- 개발자가 필요에 의해 예외를 발생시킴
		 *	- throw
		 */
		try {
		System.out.println(createRandomArray(1, 9, 3));
	}catch (Exception e) {
		
		// e.getMessage() : 예외 객체를 생성할 때 지정한 문구를 가져옴
		e.printStackTrace(); //예외가 발생한 곳들을 추적해서 콘솔에 출력, 프로그램 중단이 아님
	}
		System.out.println("프로그램 종료");
	}
	//min~max 사이의 중복되지 않은 정수 size개를 만들어서 리스트로 리턴하는 메서드
	public static  ArrayList<Integer> createRandomArray(int min, int max, int size)
	throws Exception{
		
		//중복되지 않게 size개 만큼 만들 수 없으면 예외를 발생 시킴
		//중복되지 않게 만들 수 잇는 숫자의 개수 : max - min +1
		
		if(max - min +1 < size) {
//			RuntimeException e = new RuntimeException(max - min + 1 + "개의 중복되지 않은 수" + size + "개를 만들 수 없습니다");
//			throw e;
			
			throw new RuntimeException(max - min + 1 + "개의 중복되지 않은 수" + size + "개를 만들 수 없습니다");
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while (list.size() < size) {
			Random random = new Random();
			int num = random.nextInt(min, max + 1);
			
			if(!list.contains(num)) {
				list.add(num);
			}
		}
		return list;
	}
}
