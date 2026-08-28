package day07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Ex02_Map {

	public static void main(String[] args) {
		/* Map
		 * - ket-Value형태로 데이터를 관리
		 * - Key : 중복허용 x, (아이디)
		 * - Value : 중복허용, (비번)
		 * 
		 * 	기능
		 * 	- get(key) : 키들 중 key와 일치하는 Value를 리턴
		 * 	- put?(key, Value) : 키들 중 key일치하는 객테가 잇으면 수정, 없으면 추가 
		 *  - remove(key) : 키들 중 key와 일치하는 객테가 잇으면 삭제 후 Value를 리턴
		 *  - ksetSet() : 키들을 모아 Set으로 만들어서 반환
		 */
		
		//과일 상자에 들어 잇는 과일 개수
		HashMap<String, Integer> fruitBoxs = new HashMap<String, Integer>();
		
		//사과 10개를 추가
		fruitBoxs.put("사과", 10);
		//포도 10송이 추가
		fruitBoxs.put("포도", 10);
		fruitBoxs.put("사과", 10);
		//바나나 5개 추가
		fruitBoxs.put("바나나", 5);
		
		//포도를 제거
		fruitBoxs.remove("포도", 10);
		System.out.println(fruitBoxs);
		
		//Map을 반복적으로 활용하는 예제
		Set<String> fruits = fruitBoxs.keySet();
		
		for(String fruit : fruits) {
			System.out.println(fruit + "상자 : " + fruitBoxs.get(fruit));
		}
	}

}
